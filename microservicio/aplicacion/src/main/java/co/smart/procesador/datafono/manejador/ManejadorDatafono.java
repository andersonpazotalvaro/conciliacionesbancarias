package co.smart.procesador.datafono.manejador;

import co.smart.procesador.datafono.fabrica.FabricaDatafono;
import co.smart.procesador.datafono.importarcsv.CsvImportDatafono;
import co.smart.procesador.datafonos.servicio.ServicioGuardarDatafono;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@RequiredArgsConstructor
@Component
public class ManejadorDatafono {
    private final static String GUARDO = "guardo exitosamente : ";
    private final FabricaDatafono fabricaDatafono;
    private final ServicioGuardarDatafono servicioGuardarDatafono;
    private final CsvImportDatafono csvImportDatafono;


    public String guardarDatafono(File file) throws IOException {

        var listDto = this.csvImportDatafono.importarCSV2(file);
        var listDomain = this.fabricaDatafono.convertirDtoADominio(listDto);
        this.servicioGuardarDatafono.ejecutar(listDomain);
        return GUARDO + listDomain.size() + " filas";
    }
}
