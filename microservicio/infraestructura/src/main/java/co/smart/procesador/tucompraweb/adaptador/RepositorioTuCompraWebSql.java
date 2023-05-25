package co.smart.procesador.tucompraweb.adaptador;

import co.smart.procesador.error.ExcepcionDuplicidadDatos;
import co.smart.procesador.tucompraweb.adaptador.repositorio.RepositorioEntidadTuCompraWebJpa;
import co.smart.procesador.tucompraweb.modelo.TuCompraWeb;
import co.smart.procesador.tucompraweb.puerto.RepositorioTuCompraWeb;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioTuCompraWebSql implements RepositorioTuCompraWeb {

    private final MapperTuCompraWeb mapperTuCompraWeb;

    private final RepositorioEntidadTuCompraWebJpa repositorioEntidadTuCompraWebJpa;

    public RepositorioTuCompraWebSql(MapperTuCompraWeb mapperTuCompraWeb, RepositorioEntidadTuCompraWebJpa repositorioEntidadTuCompraWebJpa) {
        this.mapperTuCompraWeb = mapperTuCompraWeb;
        this.repositorioEntidadTuCompraWebJpa = repositorioEntidadTuCompraWebJpa;
    }

    @Override
    public boolean guardar(List<TuCompraWeb> tuCompraWeb) {
        var listaEntidad= this.mapperTuCompraWeb.convertirListaDominioAEntidad(tuCompraWeb);
        this.repositorioEntidadTuCompraWebJpa.saveAll(listaEntidad);
        return true;
    }

    @Override
    public Boolean existe(List<TuCompraWeb> tuCompraWeb) {

        List<RespuestaConsultaJpa> respuestaConsultaJpas= new ArrayList<RespuestaConsultaJpa>();


        tuCompraWeb.forEach(tuCompraWeb1 -> {

            //System.out.println(tuCompraWeb1.getNumero_transaccion());
            try {
            RespuestaConsultaJpa respuesta=this.repositorioEntidadTuCompraWebJpa.consultarSiExisteRegistro(tuCompraWeb1.getNumero_transaccion());
                //System.out.println(respuesta);

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
