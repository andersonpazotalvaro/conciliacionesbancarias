package co.smart.procesador.tucompraweb.puerto;

import co.smart.procesador.tucompraweb.modelo.TuCompraWeb;

import java.util.List;

public interface RepositorioTuCompraWeb {

    boolean guardar(List<TuCompraWeb> tuCompraWeb);

    Boolean existe(List<TuCompraWeb> tuCompraWeb);

}
