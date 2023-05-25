package co.smart.procesador.tucompraweb.importarcsv;

import co.smart.procesador.tucompraapp.importarcsv.DtoTuCompraApp;
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
public class CsvImportWeb {



    public List<DtoTuCompraWeb> importarCSV(File file) throws IOException {
        List<DtoTuCompraWeb> tuCompraWebs = new ArrayList<DtoTuCompraWeb>();
        //FileReader fileReader= new FileReader("C:\\Users\\a.paz\\Downloads\\conciliaciones2\\conciliacionesBancarias\\microservicio\\aplicacion\\src\\main\\java\\co\\smart\\procesador\\tucompraweb\\importarcsv\\asd.csv",StandardCharsets.UTF_8);
        FileReader fileReader= new FileReader(file ,StandardCharsets.UTF_8);

        try {
            //System.out.println("antes");
            CSVParser csvParser = new CSVParserBuilder().withSeparator(';').withIgnoreQuotations(true).build();
            CSVReader leerTuCompraWeb= new CSVReaderBuilder(fileReader).withCSVParser(csvParser).build();



            String[] nextRecord;
            //System.out.println("despues");
            int k=0;
            //System.out.println(leerTuCompraWeb.readNext().toString());
            while ((nextRecord = leerTuCompraWeb.readNext()) != null) {
                if(k == 0){
                    k++;
                    continue;
                }
                String serialfacturacion = nextRecord[0];
                String idfactura = nextRecord[1];
                String metodo_pago = nextRecord[2];
                String banco = nextRecord[3];
                String valor_pagado = nextRecord[4];
                String valor_total = nextRecord[5];
                String valor_base = nextRecord[6];
                String valor_iva = nextRecord[7];
                String descripcion = nextRecord[8];
                String descripcion2 = nextRecord[9];
                String detalle = nextRecord[10];
                String fecha_pago = nextRecord[11];
                String hora_pago = nextRecord[12];
                String codigo_autorizacion = nextRecord[13];
                String numero_tarjeta = nextRecord[14];
                String numero_cuotas = nextRecord[15];
                String correo_comprador = nextRecord[16];
                String nombre_comprador = nextRecord[17];
                String apellidos_comprador = nextRecord[18];
                String documento_comprador = nextRecord[19];
                String telefono_comprador = nextRecord[20];
                String direccion_comprador = nextRecord[21];
                String ip_comprador = nextRecord[22];
                String ciudad_comprador = nextRecord[23];
                String pais_comprador = nextRecord[24];
                String estado_pago = nextRecord[25];
                String Causal_rechazo = nextRecord[26];
                String numero_transaccion = nextRecord[27];
                String codigo_seguridad = nextRecord[28];
                String tipo_tarjeta = nextRecord[29];
                String categoria_tarjeta = nextRecord[30];
                String pais_emisor = nextRecord[31];
                String telefono_banco_emisor = nextRecord[32];
                String banco_recaudador = nextRecord[33];
                String codigo_transaccion = nextRecord[34];
                String descripcion_transaccion = nextRecord[35];
                String valorcomision_tucompra = nextRecord[36];
                String valorivacomision_tucompra = nextRecord[37];
                String campoextra1 = nextRecord[38];
                String campoextra2 = nextRecord[39];
                String campoextra3 = nextRecord[40];
                String campoextra4 = nextRecord[41];
                String campoextra5 = nextRecord[42];
                String campoextra6 = nextRecord[43];
                String campoextra7 = nextRecord[44];
                String campoextra8 = nextRecord[45];
                String campoextra9 = nextRecord[46];
                String celularcomprador = nextRecord[47];
                String esrecurrencia = nextRecord[48];
                String tipocorte = nextRecord[49];
                String valor_desembolsado = nextRecord[50];

                tuCompraWebs.add(new DtoTuCompraWeb(
                        serialfacturacion,idfactura,metodo_pago,banco,valor_pagado,valor_total,valor_base,valor_iva,descripcion,
                        descripcion2,detalle,fecha_pago,hora_pago,codigo_autorizacion,numero_tarjeta,numero_cuotas,correo_comprador,
                        nombre_comprador,apellidos_comprador,documento_comprador,telefono_comprador,direccion_comprador,ip_comprador,
                        ciudad_comprador,pais_comprador,estado_pago,Causal_rechazo,numero_transaccion,codigo_seguridad,tipo_tarjeta,
                        categoria_tarjeta,pais_emisor,telefono_banco_emisor,banco_recaudador,codigo_transaccion,descripcion_transaccion,
                        valorcomision_tucompra,valorivacomision_tucompra,campoextra1,campoextra2,campoextra3,campoextra4,campoextra5,
                        campoextra6,campoextra7,campoextra8,campoextra9,celularcomprador,esrecurrencia,tipocorte,valor_desembolsado
                ));
            }
            leerTuCompraWeb.close();



        }catch (Exception e){

            System.out.println(e);
        }
        return tuCompraWebs;
    }

    public List<DtoTuCompraWeb> importarCSV2(File file) throws IOException {
        List<DtoTuCompraWeb> tuCompraWebs = new ArrayList<DtoTuCompraWeb>();

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

                String serialfacturacion = nextRecord[0];
                String idfactura = nextRecord[1];
                String metodo_pago = nextRecord[2];
                String banco = nextRecord[3];
                String valor_pagado = nextRecord[4];
                String valor_total = nextRecord[5];
                String valor_base = nextRecord[6];
                String valor_iva = nextRecord[7];
                String descripcion = nextRecord[8];
                String descripcion2 = nextRecord[9];
                String detalle = nextRecord[10];
                String fecha_pago = nextRecord[11];
                String hora_pago = nextRecord[12];
                String codigo_autorizacion = nextRecord[13];
                String numero_tarjeta = nextRecord[14];
                String numero_cuotas = nextRecord[15];
                String correo_comprador = nextRecord[16];
                String nombre_comprador = nextRecord[17];
                String apellidos_comprador = nextRecord[18];
                String documento_comprador = nextRecord[19];
                String telefono_comprador = nextRecord[20];
                String direccion_comprador = nextRecord[21];
                String ip_comprador = nextRecord[22];
                String ciudad_comprador = nextRecord[23];
                String pais_comprador = nextRecord[24];
                String estado_pago = nextRecord[25];
                String Causal_rechazo = nextRecord[26];
                String numero_transaccion = nextRecord[27];
                String codigo_seguridad = nextRecord[28];
                String tipo_tarjeta = nextRecord[29];
                String categoria_tarjeta = nextRecord[30];
                String pais_emisor = nextRecord[31];
                String telefono_banco_emisor = nextRecord[32];
                String banco_recaudador = nextRecord[33];
                String codigo_transaccion = nextRecord[34];
                String descripcion_transaccion = nextRecord[35];
                String valorcomision_tucompra = nextRecord[36];
                String valorivacomision_tucompra = nextRecord[37];
                String campoextra1 = nextRecord[38];
                String campoextra2 = nextRecord[39];
                String campoextra3 = nextRecord[40];
                String campoextra4 = nextRecord[41];
                String campoextra5 = nextRecord[42];
                String campoextra6 = nextRecord[43];
                String campoextra7 = nextRecord[44];
                String campoextra8 = nextRecord[45];
                String campoextra9 = nextRecord[46];
                String celularcomprador = nextRecord[47];
                String esrecurrencia = nextRecord[48];
                String tipocorte = nextRecord[49];
                String valor_desembolsado = nextRecord[50];

                tuCompraWebs.add(new DtoTuCompraWeb(
                        serialfacturacion,idfactura,metodo_pago,banco,valor_pagado,valor_total,valor_base,valor_iva,descripcion,
                        descripcion2,detalle,fecha_pago,hora_pago,codigo_autorizacion,numero_tarjeta,numero_cuotas,correo_comprador,
                        nombre_comprador,apellidos_comprador,documento_comprador,telefono_comprador,direccion_comprador,ip_comprador,
                        ciudad_comprador,pais_comprador,estado_pago,Causal_rechazo,numero_transaccion,codigo_seguridad,tipo_tarjeta,
                        categoria_tarjeta,pais_emisor,telefono_banco_emisor,banco_recaudador,codigo_transaccion,descripcion_transaccion,
                        valorcomision_tucompra,valorivacomision_tucompra,campoextra1,campoextra2,campoextra3,campoextra4,campoextra5,
                        campoextra6,campoextra7,campoextra8,campoextra9,celularcomprador,esrecurrencia,tipocorte,valor_desembolsado
                ));


            }
            br.close();
        }catch (Exception e){
            System.out.println(e);
        }


        return tuCompraWebs;

    }

}
