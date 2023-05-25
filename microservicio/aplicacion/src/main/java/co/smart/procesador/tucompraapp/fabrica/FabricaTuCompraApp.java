package co.smart.procesador.tucompraapp.fabrica;

import co.smart.procesador.tucompraapp.importarcsv.DtoTuCompraApp;
import co.smart.procesador.tucompraapp.modelo.TuCompraApp;
import co.smart.procesador.tucompraweb.importarcsv.DtoTuCompraWeb;
import co.smart.procesador.tucompraweb.modelo.TuCompraWeb;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Component
public class FabricaTuCompraApp {

    public TuCompraApp crear(DtoTuCompraApp dtoTuCompraApp){
        //System.out.println(dtoTuCompraApp);
        return new TuCompraApp(
                convertirLong(dtoTuCompraApp.getSerialfacturacion()),
                dtoTuCompraApp.getIdfactura(),
                dtoTuCompraApp.getMetodo_pago(),
                dtoTuCompraApp.getBanco(),
                convertirInt(dtoTuCompraApp.getValor_pagado()),
                convertirInt(dtoTuCompraApp.getValor_total()),
                convertirInt(dtoTuCompraApp.getValor_base()),
                convertirInt(dtoTuCompraApp.getValor_iva()),
                dtoTuCompraApp.getDescripcion(),
                dtoTuCompraApp.getDescripcion2(),
                dtoTuCompraApp.getDetalle(),
                convertirLocalDateTime(dtoTuCompraApp.getFecha_pago()),
                convertirLocalTime(dtoTuCompraApp.getHora_pago()),
                dtoTuCompraApp.getCodigo_autorizacion(),
                dtoTuCompraApp.getNumero_tarjeta(),
                convertirInt(dtoTuCompraApp.getNumero_cuotas()),
                dtoTuCompraApp.getCorreo_comprador(),
                dtoTuCompraApp.getNombre_comprador(),
                dtoTuCompraApp.getApellidos_comprador(),
                dtoTuCompraApp.getDocumento_comprador(),
                dtoTuCompraApp.getTelefono_comprador(),
                dtoTuCompraApp.getDireccion_comprador(),
                dtoTuCompraApp.getIp_comprador(),
                convertirInt(dtoTuCompraApp.getCiudad_comprador()),
                dtoTuCompraApp.getCiudad_comprador(),
                dtoTuCompraApp.getEstado_pago(),
                dtoTuCompraApp.getCausal_rechazo(),
                dtoTuCompraApp.getNumero_transaccion(),
                dtoTuCompraApp.getCodigo_seguridad(),
                dtoTuCompraApp.getTipo_tarjeta(),
                dtoTuCompraApp.getCategoria_tarjeta(),
                dtoTuCompraApp.getPais_emisor(),
                dtoTuCompraApp.getTelefono_banco_emisor(),
                dtoTuCompraApp.getBanco_recaudador(),
                dtoTuCompraApp.getCodigo_transaccion(),
                dtoTuCompraApp.getDescripcion_transaccion(),
                convertirInt(dtoTuCompraApp.getValorcomision_tucompra()),
                convertirInt(dtoTuCompraApp.getValorivacomision_tucompra()),
                dtoTuCompraApp.getCampoextra1(),
                dtoTuCompraApp.getCampoextra2(),
                dtoTuCompraApp.getCampoextra3(),
                dtoTuCompraApp.getCampoextra4(),
                dtoTuCompraApp.getCampoextra5(),
                dtoTuCompraApp.getCampoextra6(),
                dtoTuCompraApp.getCampoextra7(),
                dtoTuCompraApp.getCampoextra8(),
                dtoTuCompraApp.getCampoextra9(),
                dtoTuCompraApp.getCelularcomprador(),
                dtoTuCompraApp.getEsrecurrencia(),
                dtoTuCompraApp.getTipocorte(),
                convertirFloat(dtoTuCompraApp.getValor_desembolsado())


        );
    }

    public List<TuCompraApp> convertirDtoADominio(List<DtoTuCompraApp> tuCompraApps){
        var listaDomain= new ArrayList<TuCompraApp>();
        tuCompraApps.forEach(dtoTuCompraApp -> {
            listaDomain.add(this.crear(dtoTuCompraApp));
        });
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

    public Float convertirFloat(String cadena){
        Float respuesta = null;
        try {
            respuesta = Float.parseFloat(cadena);
        }catch (Exception e){

        }
        return respuesta;
    }

    public LocalTime convertirLocalTime(String cadena){
        String time = cadena.replace("p. m.", "PM").replace("a. m.", "AM");
        LocalTime respuesta= null;
        try {
            respuesta = LocalTime.parse(time,  DateTimeFormatter.ofPattern("h:mm:ss a", Locale.US));
        }catch (Exception e){

        }
        return respuesta;
    }

    public LocalDateTime convertirLocalDateTime(String cadena){
        LocalDateTime respuesta= null;
        String nuevaCadena= cadena.replace("p. m.","").replace("a. m.","");
        System.out.println(nuevaCadena);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy H:mm:ss");
        try {

            respuesta = LocalDateTime.parse(nuevaCadena, formatter);

        }catch (Exception e){

        }
        return respuesta;
    }

    public LocalDate convertirLocalDate(String cadena){
        LocalDate respuesta= null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");



        respuesta = LocalDate.parse(cadena, formatter);

        //return formatter.parse(cadena,formatter);
        return respuesta;
    }
}
