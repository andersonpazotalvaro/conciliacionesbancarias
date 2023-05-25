package co.smart.procesador.error;

public class ExcepcionDuplicidadDatos extends RuntimeException {

    public ExcepcionDuplicidadDatos(String mensaje) {
        super(mensaje);
    }
}
