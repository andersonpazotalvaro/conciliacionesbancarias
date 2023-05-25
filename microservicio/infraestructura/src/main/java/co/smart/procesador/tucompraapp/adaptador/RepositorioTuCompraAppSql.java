package co.smart.procesador.tucompraapp.adaptador;

import co.smart.procesador.error.ExcepcionDuplicidadDatos;
import co.smart.procesador.tucompraapp.adaptador.repositorio.RepositorioEntidadTuCompraAppJpa;
import co.smart.procesador.tucompraapp.modelo.TuCompraApp;
import co.smart.procesador.tucompraapp.puerto.RepositorioTuCompraApp;
import co.smart.procesador.tucompraweb.adaptador.RespuestaConsultaJpa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioTuCompraAppSql implements RepositorioTuCompraApp {

    private final static String YA_EXISTE= " Los datos de este Archivo ya existen ";
    private final static String Guardo= "Guardo";

    private final MapperTuCompraApp mapperTuCompraApp;

    private final RepositorioEntidadTuCompraAppJpa repositorioEntidadTuCompraAppJpa;

    public RepositorioTuCompraAppSql(MapperTuCompraApp mapperTuCompraApp, RepositorioEntidadTuCompraAppJpa repositorioEntidadTuCompraAppJpa) {
        this.mapperTuCompraApp = mapperTuCompraApp;
        this.repositorioEntidadTuCompraAppJpa = repositorioEntidadTuCompraAppJpa;
    }


    @Override
    public boolean guardar(List<TuCompraApp> tuCompraApp) {
        var listaEntidad= this.mapperTuCompraApp.convertirListaDominioAEntidad(tuCompraApp);

        this.repositorioEntidadTuCompraAppJpa.saveAll(listaEntidad);
        return true;
    }

    @Override
    public Boolean existe(List<TuCompraApp> tuCompraApp) {

        List<RespuestaConsultaJpa> respuestaConsultaJpas= new ArrayList<RespuestaConsultaJpa>();
        tuCompraApp.forEach(tuCompraApp1 -> {
            try {
            var respuesta=this.repositorioEntidadTuCompraAppJpa.consultarSiExisteRegistro(tuCompraApp1.getNumero_transaccion().toString());
            if(respuesta!=null){
            respuestaConsultaJpas.add(respuesta);
            }
        }catch (Exception e){
            throw new ExcepcionDuplicidadDatos("El informe ya existe");
        }
        });
        if (respuestaConsultaJpas == null || respuestaConsultaJpas.size() == 0) {
            return false;
        }
        return true;
    }
}
