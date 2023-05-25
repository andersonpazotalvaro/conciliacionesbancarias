package co.smart.procesador.tucompraapp.controlador;

import co.smart.procesador.error.ExcepcionDuplicidadDatos;
import co.smart.procesador.tucompraapp.manejador.ManejadorTuCompraApp;
import org.apache.commons.io.FileUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("ConciliaiconesBancarias")
public class ControladorTuCompraApp {
    private final Path root = Paths.get("uploads/");
    private final static String NO_GUARDO = "fallo al intentar guardar";
    private static final String EL_INFORME_YA_EXISTE = "Los datos ya existen";

    private final ManejadorTuCompraApp manejadorTuCompraApp;

    public ControladorTuCompraApp(ManejadorTuCompraApp manejadorTuCompraApp) {
        this.manejadorTuCompraApp = manejadorTuCompraApp;
    }


    @RequestMapping(value= "/TuCompraApp/**", method = RequestMethod.GET)
    public String enviar(HttpServletRequest path){
        String cadena = path.getRequestURI().split(path.getContextPath() + "/TuCompraApp/")[1];

         File file1= new File(cadena);

        String mensaje=NO_GUARDO;
        try {
            mensaje= this.manejadorTuCompraApp.guardarTuCompraApp(file1);
        }catch (Exception e){
            throw new ExcepcionDuplicidadDatos(String.format(EL_INFORME_YA_EXISTE));
        }
        return mensaje ;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE , value = "/TuCompraApp/guardar")
    public ResponseEntity<Void> enviar2(@RequestParam("file") MultipartFile file) throws IOException {

        delate(root+"/"+file.getOriginalFilename());
        FileUtils.cleanDirectory(root.toFile());

        long copia = Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));

        File fileTemporal = new File(root+"/"+file.getOriginalFilename());

        String mensaje=NO_GUARDO;
        try {
            mensaje= this.manejadorTuCompraApp.guardarTuCompraApp(fileTemporal);
            delate(root+"/"+file.getOriginalFilename());
            return ResponseEntity.ok().build();

        }catch (Exception e){
            FileUtils.cleanDirectory(root.toFile());
            delate(root+"/"+file.getOriginalFilename());
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
