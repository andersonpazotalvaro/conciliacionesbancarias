package co.smart.procesador.datafono.importarcsv;

import co.smart.procesador.tucompraweb.importarcsv.DtoTuCompraWeb;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Component
public class CsvImportDatafono {

    public List<DtoDatafono> importarCSV(File file) throws IOException {
        List<DtoDatafono> datafonos = new ArrayList<DtoDatafono>();

        FileReader fileReader= new FileReader(file ,StandardCharsets.UTF_8);

        try {

            CSVParser csvParser = new CSVParserBuilder().withSeparator(';').withIgnoreQuotations(true).build();
            CSVReader leerDatafono= new CSVReaderBuilder(fileReader).withCSVParser(csvParser).build();



            String[] nextRecord;

            int k=0;

            while ((nextRecord = leerDatafono.readNext()) != null) {
                if(k == 0){
                    k++;
                    continue;
                }
                String nit = nextRecord[0];
                String codigo_establecimiento = nextRecord[1];
                String origen_de_la_compra = nextRecord[2];
                String tipo_de_transaccion = nextRecord[3];
                String franquicia = nextRecord[4];
                String identificador_de_red = nextRecord[5];
                String fecha_de_transaccion = nextRecord[6];
                String fecha_de_canje = nextRecord[7];
                String cuenta_de_consignacion = nextRecord[8];
                String valor_compra = nextRecord[9];
                String valor_propina = nextRecord[10];
                String valor_iva = nextRecord[11];
                String valor_impoconsumo = nextRecord[12];
                String valor_total = nextRecord[13];
                String valor_comision = nextRecord[14];
                String valor_rete_fuente = nextRecord[15];
                String valor_rete_iva = nextRecord[16];
                String valor_rete_ica = nextRecord[17];
                String valor_provision = nextRecord[18];
                String valor_neto = nextRecord[19];
                String codigo_autorizacion = nextRecord[20];
                String tipo_tarjeta = nextRecord[21];
                String no_terminal = nextRecord[22];
                String tarjeta = nextRecord[23];
                String comision_porcentual = nextRecord[24];
                String comision_base = nextRecord[25];
                String fecha_de_compensacion = nextRecord[26];


                datafonos.add(new DtoDatafono(
                        nit,codigo_establecimiento,origen_de_la_compra,tipo_de_transaccion,franquicia,identificador_de_red,fecha_de_transaccion,
                        fecha_de_canje,cuenta_de_consignacion,valor_compra,valor_propina,valor_iva,valor_impoconsumo,valor_total,valor_comision,
                        valor_rete_fuente,valor_rete_iva,valor_rete_ica,valor_provision,valor_neto,codigo_autorizacion,tipo_tarjeta,no_terminal,tarjeta,
                        comision_porcentual,comision_base,fecha_de_compensacion
                ));
            }
            leerDatafono.close();



        }catch (Exception e){

            System.out.println(e);
        }
        return datafonos;
    }


    public List<DtoDatafono> importarCSV2(File file) throws IOException {
        List<DtoDatafono> datafonos = new ArrayList<DtoDatafono>();

        try {

            if (!file.exists()) {
                throw new RuntimeException("Ruta o archivo inexistente");
            }

            BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.ISO_8859_1));
            int lineNumber = 0;

            String nextRecor;
            while ((nextRecor = br.readLine()) != null) {



                if (lineNumber == 0) {
                    lineNumber++;
                    continue;
                }
                String[] nextRecord = nextRecor.split(";");

                String nit = nextRecord[0];
                String codigo_establecimiento = nextRecord[1];
                String origen_de_la_compra = nextRecord[2];
                String tipo_de_transaccion = nextRecord[3];
                String franquicia = nextRecord[4];
                String identificador_de_red = nextRecord[5];
                String fecha_de_transaccion = nextRecord[6];
                String fecha_de_canje = nextRecord[7];
                String cuenta_de_consignacion = nextRecord[8];
                String valor_compra = nextRecord[9];
                String valor_propina = nextRecord[10];
                String valor_iva = nextRecord[11];
                String valor_impoconsumo = nextRecord[12];
                String valor_total = nextRecord[13];
                String valor_comision = nextRecord[14];
                String valor_rete_fuente = nextRecord[15];
                String valor_rete_iva = nextRecord[16];
                String valor_rete_ica = nextRecord[17];
                String valor_provision = nextRecord[18];
                String valor_neto = nextRecord[19];
                String codigo_autorizacion = nextRecord[20];
                String tipo_tarjeta = nextRecord[21];
                String no_terminal = nextRecord[22];
                String tarjeta = nextRecord[23];
                String comision_porcentual = nextRecord[24];
                String comision_base = nextRecord[25];
                String fecha_de_compensacion = nextRecord[26];


                datafonos.add(new DtoDatafono(
                        nit,codigo_establecimiento,origen_de_la_compra,tipo_de_transaccion,franquicia,identificador_de_red,fecha_de_transaccion,
                        fecha_de_canje,cuenta_de_consignacion,valor_compra,valor_propina,valor_iva,valor_impoconsumo,valor_total,valor_comision,
                        valor_rete_fuente,valor_rete_iva,valor_rete_ica,valor_provision,valor_neto,codigo_autorizacion,tipo_tarjeta,no_terminal,tarjeta,
                        comision_porcentual,comision_base,fecha_de_compensacion
                ));


            }
            br.close();
        }catch (Exception e){
            System.out.println(e);
        }


        return datafonos;

    }

}
