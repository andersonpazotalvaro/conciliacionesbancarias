package co.smart.procesador.tucompraweb.fabrica;

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
public class FabricaTuCompraWeb {

    public TuCompraWeb crear(DtoTuCompraWeb dtoTuCompraWeb){
        return new TuCompraWeb(
                convertirLong(dtoTuCompraWeb.getSerialfacturacion()),
                dtoTuCompraWeb.getIdfactura(),
                dtoTuCompraWeb.getMetodo_pago(),
                dtoTuCompraWeb.getBanco(),
                convertirInt(dtoTuCompraWeb.getValor_pagado()),
                convertirInt(dtoTuCompraWeb.getValor_total()),
                convertirInt(dtoTuCompraWeb.getValor_base()),
                convertirInt(dtoTuCompraWeb.getValor_iva()),
                dtoTuCompraWeb.getDescripcion(),
                dtoTuCompraWeb.getDescripcion2(),
                dtoTuCompraWeb.getDetalle(),
                convertirLocalDateTime(dtoTuCompraWeb.getFecha_pago()),
                convertirLocalTime(dtoTuCompraWeb.getHora_pago()),
                dtoTuCompraWeb.getCodigo_autorizacion(),
                dtoTuCompraWeb.getNumero_tarjeta(),
                convertirInt(dtoTuCompraWeb.getNumero_cuotas()),
                dtoTuCompraWeb.getCorreo_comprador(),
                dtoTuCompraWeb.getNombre_comprador(),
                dtoTuCompraWeb.getApellidos_comprador(),
                dtoTuCompraWeb.getDocumento_comprador(),
                dtoTuCompraWeb.getTelefono_comprador(),
                dtoTuCompraWeb.getDireccion_comprador(),
                dtoTuCompraWeb.getIp_comprador(),
                convertirInt(dtoTuCompraWeb.getCiudad_comprador()),
                dtoTuCompraWeb.getCiudad_comprador(),
                dtoTuCompraWeb.getEstado_pago(),
                dtoTuCompraWeb.getCausal_rechazo(),
                dtoTuCompraWeb.getNumero_transaccion(),
                dtoTuCompraWeb.getCodigo_seguridad(),
                dtoTuCompraWeb.getTipo_tarjeta(),
                dtoTuCompraWeb.getCategoria_tarjeta(),
                dtoTuCompraWeb.getPais_emisor(),
                dtoTuCompraWeb.getTelefono_banco_emisor(),
                dtoTuCompraWeb.getBanco_recaudador(),
                dtoTuCompraWeb.getCodigo_transaccion(),
                dtoTuCompraWeb.getDescripcion_transaccion(),
                convertirInt(dtoTuCompraWeb.getValorcomision_tucompra()),
                convertirInt(dtoTuCompraWeb.getValorivacomision_tucompra()),
                dtoTuCompraWeb.getCampoextra1(),
                dtoTuCompraWeb.getCampoextra2(),
                dtoTuCompraWeb.getCampoextra3(),
                dtoTuCompraWeb.getCampoextra4(),
                dtoTuCompraWeb.getCampoextra5(),
                dtoTuCompraWeb.getCampoextra6(),
                dtoTuCompraWeb.getCampoextra7(),
                dtoTuCompraWeb.getCampoextra8(),
                dtoTuCompraWeb.getCampoextra9(),
                dtoTuCompraWeb.getCelularcomprador(),
                dtoTuCompraWeb.getEsrecurrencia(),
                dtoTuCompraWeb.getTipocorte(),
                convertirFloat(dtoTuCompraWeb.getValor_desembolsado())


        );
    }

    public List<TuCompraWeb> convertirDtoADominio(List<DtoTuCompraWeb> tuCompraWebs){
        var listaDomain= new ArrayList<TuCompraWeb>();
        tuCompraWebs.forEach(dtoTuCompraWeb -> {
            listaDomain.add(this.crear(dtoTuCompraWeb));
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
