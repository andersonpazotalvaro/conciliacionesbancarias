package co.smart.procesador.tucompraweb.controlador;

import co.smart.procesador.error.ExcepcionDuplicidadDatos;
import co.smart.procesador.tucompraweb.manejador.ManejadorTuCompraWeb;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("prueba")
public class pruebaBack {
    private final Path root = Paths.get("uploads/");
    private final static String NO_GUARDO = "fallo al intentar guardar";
    private final static String GUARDO = "Guardo exitosamente";
    private static final String EL_INFORME_YA_EXISTE = "Los datos ya existen";

    private final ManejadorTuCompraWeb manejadorTuCompraWeb;

    public pruebaBack(ManejadorTuCompraWeb manejadorTuCompraWeb) {
        this.manejadorTuCompraWeb = manejadorTuCompraWeb;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String enviar(){

        return "conexion con el backend" ;
    }



}
