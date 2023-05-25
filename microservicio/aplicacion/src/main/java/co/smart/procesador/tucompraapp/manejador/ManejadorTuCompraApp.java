package co.smart.procesador.tucompraapp.manejador;

import co.smart.procesador.tucompraapp.fabrica.FabricaTuCompraApp;
import co.smart.procesador.tucompraapp.importarcsv.CsvImportApp;
import co.smart.procesador.tucompraapp.servicio.ServicioGuardarTuCompraApp;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@RequiredArgsConstructor
@Component
public class ManejadorTuCompraApp {
    private final static String GUARDO = "guardo exitosamente : ";
    private final FabricaTuCompraApp fabricaTuCompraApp;
    private final ServicioGuardarTuCompraApp servicioGuardarTuCompraApp;
    private final CsvImportApp csvImportApp;


    public String guardarTuCompraApp(File file) throws IOException {

        var listDto = this.csvImportApp.importarCSV2(file);
        var listDomain = this.fabricaTuCompraApp.convertirDtoADominio(listDto);

        String mensaje = this.servicioGuardarTuCompraApp.ejecutar(listDomain);
        return mensaje + listDomain.size() + " filas";
    }
}
