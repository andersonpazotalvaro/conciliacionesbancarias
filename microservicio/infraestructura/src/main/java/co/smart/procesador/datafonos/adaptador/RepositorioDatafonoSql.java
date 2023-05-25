package co.smart.procesador.datafonos.adaptador;

import co.smart.procesador.datafonos.adaptador.repositorio.RepositorioEntidadDatafonoJpa;
import co.smart.procesador.datafonos.modelo.Datafono;
import co.smart.procesador.datafonos.puerto.RepositorioDatafono;
import co.smart.procesador.error.ExcepcionDuplicidadDatos;
import co.smart.procesador.tucompraapp.modelo.TuCompraApp;
import co.smart.procesador.tucompraweb.adaptador.RespuestaConsultaJpa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioDatafonoSql implements RepositorioDatafono {

    private final static String YA_EXISTE= " Los datos de este Archivo ya existen ";
    private final static String Guardo= "Guardo";

    private final MapperDatafono mapperDatafono;

    private final RepositorioEntidadDatafonoJpa repositorioEntidadDatafonoJpa;

    public RepositorioDatafonoSql(MapperDatafono mapperDatafono, RepositorioEntidadDatafonoJpa repositorioEntidadDatafonoJpa) {
        this.mapperDatafono = mapperDatafono;
        this.repositorioEntidadDatafonoJpa = repositorioEntidadDatafonoJpa;
    }


    @Override
    public boolean guardar(List<Datafono> datafonos) {
        //System.out.println(tuCompraWeb.get(0).getSerialfacturacion());
        var listaEntidad= this.mapperDatafono.convertirListaDominioAEntidad(datafonos);
        //System.out.println(listaEntidad.size());
        this.repositorioEntidadDatafonoJpa.saveAll(listaEntidad);
        return true;
    }

    @Override
    public Boolean existe(List<Datafono> datafonos) {
        //String respuesta;
        List<RespuestaConsultaDatafonoJpa> respuestaConsultaJpas= new ArrayList<RespuestaConsultaDatafonoJpa>();
        datafonos.forEach(datafono  -> {
            try {
            var respuesta=this.repositorioEntidadDatafonoJpa.consultarSiExisteRegistro(datafono.getCodigo_autorizacion().toString());
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
