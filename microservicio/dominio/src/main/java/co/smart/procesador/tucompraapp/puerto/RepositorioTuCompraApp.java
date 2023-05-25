package co.smart.procesador.tucompraapp.puerto;

import co.smart.procesador.tucompraapp.modelo.TuCompraApp;

import java.util.List;

public interface RepositorioTuCompraApp {

    boolean guardar(List<TuCompraApp> tuCompraApp);

    Boolean existe(List<TuCompraApp> tuCompraApp);

}
