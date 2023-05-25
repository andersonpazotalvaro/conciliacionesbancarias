package co.smart.procesador.datafonos.controlador;

import co.smart.procesador.datafono.manejador.ManejadorDatafono;
import co.smart.procesador.error.ExcepcionDuplicidadDatos;
import org.apache.commons.io.FileUtils;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
@RestController
@RequestMapping("ConciliaiconesBancarias")
public class ControladorDatafono {
    private final Path root = Paths.get("uploads/");
    private final static String NO_GUARDO = "fallo al intentar guardar";
    private static final String EL_INFORME_YA_EXISTE = "Los datos ya existen";

    private final ManejadorDatafono manejadorDatafono;

    public ControladorDatafono(ManejadorDatafono manejadorDatafono) {
        this.manejadorDatafono = manejadorDatafono;
    }

    @RequestMapping(value= "/Datafono/**", method = RequestMethod.GET)
    public String enviar(HttpServletRequest path){
        String cadena = path.getRequestURI().split(path.getContextPath() + "/Datafono/")[1];
        File file1= new File(cadena);

        String mensaje=NO_GUARDO;
        try {
            mensaje= this.manejadorDatafono.guardarDatafono(file1);
        }catch (Exception e){
            throw new ExcepcionDuplicidadDatos(String.format(EL_INFORME_YA_EXISTE));
        }
        return mensaje ;
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE , value = "/Datafono/guardar")
    public ResponseEntity<Void> enviar2(@RequestPart("file") MultipartFile file) throws IOException {
        delate(root+"/"+file.getOriginalFilename());
        FileUtils.cleanDirectory(root.toFile());

        long copia = Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));

        File fileTemporal = new File(root+"/"+file.getOriginalFilename());

        String mensaje=NO_GUARDO;
        try {
            mensaje= this.manejadorDatafono.guardarDatafono(fileTemporal);
            delate(root+"/"+file.getOriginalFilename());
            return ResponseEntity.ok().build();
        }catch (Exception e){
            delate(root+"/"+file.getOriginalFilename());
            FileUtils.cleanDirectory(root.toFile());
            if (e.getMessage() == "El informe ya existe"){
                return ResponseEntity.notFound().build();
            }else {
                return ResponseEntity.badRequest().build();
            }
        }
    }



    public void delate(String fileName){
        File fileObj= new File(fileName);
        if (fileObj.exists()){
            fileObj.delete();

        }
    }

}
