package co.smart.procesador.datafono.fabrica;

import co.smart.procesador.datafono.importarcsv.DtoDatafono;
import co.smart.procesador.datafonos.modelo.Datafono;
import co.smart.procesador.tucompraweb.importarcsv.DtoTuCompraWeb;
import co.smart.procesador.tucompraweb.modelo.TuCompraWeb;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
public class FabricaDatafono {

    public Datafono crear(DtoDatafono dtoDatafono) throws ParseException {
        //System.out.println(dtoDatafono);
        return new Datafono(
                dtoDatafono.getNit(),
                dtoDatafono.getCodigo_establecimiento(),
                dtoDatafono.getOrigen_de_la_compra(),
                dtoDatafono.getTipo_de_transaccion(),
                dtoDatafono.getFranquicia(),
                dtoDatafono.getIdentificador_de_red(),
                convertirLocalDate(dtoDatafono.getFecha_de_transaccion()),
                convertirLocalDate(dtoDatafono.getFecha_de_canje()),
                dtoDatafono.getCuenta_de_consignacion(),
                convertirFloat(dtoDatafono.getValor_compra()),
                convertirFloat(dtoDatafono.getValor_propina()),
                convertirFloat(dtoDatafono.getValor_iva()),
                convertirFloat(dtoDatafono.getValor_impoconsumo()),
                convertirFloat(dtoDatafono.getValor_total()),
                convertirFloat(dtoDatafono.getValor_comision()),
                convertirFloat(dtoDatafono.getValor_rete_fuente()),
                convertirFloat(dtoDatafono.getValor_rete_iva()),
                convertirFloat(dtoDatafono.getValor_rete_ica()),
                convertirFloat(dtoDatafono.getValor_provision()),
                convertirFloat(dtoDatafono.getValor_neto()),
                dtoDatafono.getCodigo_autorizacion(),
                dtoDatafono.getTipo_tarjeta(),
                dtoDatafono.getNo_terminal(),
                dtoDatafono.getTarjeta(),
                dtoDatafono.getComision_porcentual(),
                convertirFloat(dtoDatafono.getComision_base()),
                dtoDatafono.getFecha_compensacion()


        );
    }

    public List<Datafono> convertirDtoADominio(List<DtoDatafono> datafonos){
        var listaDomain= new ArrayList<Datafono>();
        datafonos.forEach(dtoDatafono -> {
            try {
                listaDomain.add(this.crear(dtoDatafono));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(listaDomain.get(1).getCodigo_autorizacion());
        return listaDomain;
    }

    public int convertirInt(String cadena){
        int respuesta=0;
        try {
            respuesta = Integer.valueOf(cadena);
        }catch (Exception e){

        }
        return respuesta;
    }

    public Long convertirLong(String cadena){
        Long respuesta = null;
        try {
            respuesta = Long.parseLong(cadena);
        }catch (Exception e){

        }
        return respuesta;
    }

    /*public Float convertirFloat(String cadena){
        Float respuesta = null;
        try {
            respuesta = Float.parseFloat(cadena);
        }catch (Exception e){

        }
        return respuesta;
    }*/

    public Float convertirFloat(String cadena) throws ParseException {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        decimalFormat.setDecimalFormatSymbols(symbols);

        return decimalFormat.parse(cadena).floatValue();
    }

    public LocalTime convertirLocalTime(String cadena){
        LocalTime respuesta= null;
        try {
            respuesta = LocalTime.parse(cadena);
        }catch (Exception e){

        }
        return respuesta;
    }

    public LocalDateTime convertirLocalDateTime(String cadena){
        LocalDateTime respuesta= null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        try {

            respuesta = LocalDateTime.parse(cadena, formatter);

        }catch (Exception e){

        }
        return respuesta;
    }

    public LocalDate convertirLocalDate(String cadena){
        LocalDate respuesta= null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");



            respuesta = LocalDate.parse(cadena, formatter);

        //return formatter.parse(cadena,formatter);
        return respuesta;
    }
}
