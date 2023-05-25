package co.smart.procesador.datafonos.servicio;

import co.smart.procesador.datafonos.modelo.Datafono;
import co.smart.procesador.datafonos.puerto.RepositorioDatafono;
import co.smart.procesador.excepcion.ExcepcionDuplicidad;
import co.smart.procesador.tucompraapp.modelo.TuCompraApp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioGuardarDatafono {


    private static final String EL_INFORME_YA_EXISTE = "El informe ya existe";
    private final static String GUARDO = "guardo exitosamente : ";

    private final RepositorioDatafono repositorioDatafono;

    public ServicioGuardarDatafono(RepositorioDatafono repositorioDatafono) {
        this.repositorioDatafono = repositorioDatafono;
    }

    public String ejecutar(List<Datafono> datafonos){
        this.existe(datafonos);
        this.repositorioDatafono.guardar(datafonos);
        return GUARDO;
    }

    public void existe(List<Datafono> datafonos){
        if(this.repositorioDatafono.existe(datafonos)) {
            throw new ExcepcionDuplicidad(String.format(EL_INFORME_YA_EXISTE));
        }
    }

}
