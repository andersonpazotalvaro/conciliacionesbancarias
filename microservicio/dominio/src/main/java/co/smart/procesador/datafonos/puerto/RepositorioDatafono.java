package co.smart.procesador.datafonos.puerto;

import co.smart.procesador.datafonos.modelo.Datafono;

import java.util.List;

public interface RepositorioDatafono {

    boolean guardar(List<Datafono> datafonos);

    Boolean existe(List<Datafono> datafonos);

}
