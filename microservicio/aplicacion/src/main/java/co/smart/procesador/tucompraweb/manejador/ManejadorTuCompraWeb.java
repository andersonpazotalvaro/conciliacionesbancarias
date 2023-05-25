package co.smart.procesador.tucompraweb.manejador;

import co.smart.procesador.tucompraweb.fabrica.FabricaTuCompraWeb;
import co.smart.procesador.tucompraweb.importarcsv.CsvImportWeb;
import co.smart.procesador.tucompraweb.servicio.ServicioGuardarTuCompraWeb;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@RequiredArgsConstructor
@Component
public class ManejadorTuCompraWeb {
    private final static String GUARDO = "guardo exitosamente : ";
    private final FabricaTuCompraWeb fabricaTuCompraWeb;
    private final ServicioGuardarTuCompraWeb servicioGuardarTuCompraWeb;
    private final CsvImportWeb csvImportWeb;


    public String guardarTuCompraWeb(File file) throws IOException {

        var listDto = this.csvImportWeb.importarCSV2(file);
        var listDomain = this.fabricaTuCompraWeb.convertirDtoADominio(listDto);
        String mensaje = this.servicioGuardarTuCompraWeb.ejecutar(listDomain);
        return mensaje+ listDomain.size() + " filas";
    }
}
