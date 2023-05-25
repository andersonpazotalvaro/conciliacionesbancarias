package co.smart.procesador.tucompraweb.servicio;

import co.smart.procesador.excepcion.ExcepcionDuplicidad;
import co.smart.procesador.tucompraweb.modelo.TuCompraWeb;
import co.smart.procesador.tucompraweb.puerto.RepositorioTuCompraWeb;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioGuardarTuCompraWeb {


    private static final String EL_INFORME_YA_EXISTE = "El informe ya existe : ";
    private final static String GUARDO = "guardo exitosamente : ";

    private final RepositorioTuCompraWeb repositorioTuCompraWeb;

    public ServicioGuardarTuCompraWeb(RepositorioTuCompraWeb repositorioTuCompraWeb) {
        this.repositorioTuCompraWeb = repositorioTuCompraWeb;
    }

    public String ejecutar(List<TuCompraWeb> tuCompraWebs){
            this.existe(tuCompraWebs);
            this.repositorioTuCompraWeb.guardar(tuCompraWebs);
            return GUARDO;
    }

    public void existe(List<TuCompraWeb> tuCompraWebs){
        if(this.repositorioTuCompraWeb.existe(tuCompraWebs)) {
            throw new ExcepcionDuplicidad(String.format(EL_INFORME_YA_EXISTE));
        }
    }

}
