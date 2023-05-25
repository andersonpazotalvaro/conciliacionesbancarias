package co.smart.procesador.tucompraapp.servicio;

import co.smart.procesador.excepcion.ExcepcionDuplicidad;
import co.smart.procesador.tucompraapp.modelo.TuCompraApp;
import co.smart.procesador.tucompraapp.puerto.RepositorioTuCompraApp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioGuardarTuCompraApp {


    private static final String EL_INFORME_YA_EXISTE = "El informe ya existe";

    private final static String GUARDO = "guardo exitosamente : ";

    private final RepositorioTuCompraApp repositorioTuCompraApp;

    public ServicioGuardarTuCompraApp(RepositorioTuCompraApp repositorioTuCompraApp) {
        this.repositorioTuCompraApp = repositorioTuCompraApp;
    }

    public String ejecutar(List<TuCompraApp> tuCompraApps){
        this.existe(tuCompraApps);
        this.repositorioTuCompraApp.guardar(tuCompraApps);
        return GUARDO;
    }

    public void existe(List<TuCompraApp> tuCompraApps){
        if(this.repositorioTuCompraApp.existe(tuCompraApps)) {
            throw new ExcepcionDuplicidad(String.format(EL_INFORME_YA_EXISTE));
        }
    }

}
