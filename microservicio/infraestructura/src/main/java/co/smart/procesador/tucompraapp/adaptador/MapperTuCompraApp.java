package co.smart.procesador.tucompraapp.adaptador;

import co.smart.procesador.tucompraapp.entidad.EntidadTuCompraApp;
import co.smart.procesador.tucompraapp.modelo.TuCompraApp;
import co.smart.procesador.tucompraweb.entidad.EntidadTuCompraWeb;
import co.smart.procesador.tucompraweb.modelo.TuCompraWeb;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MapperTuCompraApp {

    public EntidadTuCompraApp crearEntidad(TuCompraApp tuCompraApp){

        return new EntidadTuCompraApp(
                tuCompraApp.getSerialfacturacion(),
                tuCompraApp.getIdfactura(),
                tuCompraApp.getMetodo_pago(),
                tuCompraApp.getBanco(),
                tuCompraApp.getValor_pagado(),
                tuCompraApp.getValor_total(),
                tuCompraApp.getValor_base(),
                tuCompraApp.getValor_iva(),
                tuCompraApp.getDescripcion(),
                tuCompraApp.getDescripcion2(),
                tuCompraApp.getDetalle(),
                tuCompraApp.getFecha_pago(),
                tuCompraApp.getHora_pago(),
                tuCompraApp.getCodigo_autorizacion(),
                tuCompraApp.getNumero_tarjeta(),
                tuCompraApp.getNumero_cuotas(),
                tuCompraApp.getCorreo_comprador(),
                tuCompraApp.getNombre_comprador(),
                tuCompraApp.getApellidos_comprador(),
                tuCompraApp.getDocumento_comprador(),
                tuCompraApp.getTelefono_comprador(),
                tuCompraApp.getDireccion_comprador(),
                tuCompraApp.getIp_comprador(),
                tuCompraApp.getCiudad_comprador(),
                tuCompraApp.getPais_comprador(),
                tuCompraApp.getEstado_pago(),
                tuCompraApp.getCausal_rechazo(),
                tuCompraApp.getNumero_transaccion(),
                tuCompraApp.getCodigo_seguridad(),
                tuCompraApp.getTipo_tarjeta(),
                tuCompraApp.getCategoria_tarjeta(),
                tuCompraApp.getPais_emisor(),
                tuCompraApp.getTelefono_banco_emisor(),
                tuCompraApp.getBanco_recaudador(),
                tuCompraApp.getCodigo_transaccion(),
                tuCompraApp.getDescripcion_transaccion(),
                tuCompraApp.getValorcomision_tucompra(),
                tuCompraApp.getValorivacomision_tucompra(),
                tuCompraApp.getCampoextra1(),
                tuCompraApp.getCampoextra2(),
                tuCompraApp.getCampoextra3(),
                tuCompraApp.getCampoextra4(),
                tuCompraApp.getCampoextra5(),
                tuCompraApp.getCampoextra6(),
                tuCompraApp.getCampoextra7(),
                tuCompraApp.getCampoextra8(),
                tuCompraApp.getCampoextra9(),
                tuCompraApp.getCelularcomprador(),
                tuCompraApp.getEsrecurrencia(),
                tuCompraApp.getTipocorte(),
                tuCompraApp.getValor_desembolsado()

        );
    }

    public List<EntidadTuCompraApp> convertirListaDominioAEntidad(List<TuCompraApp> tuCompraApp){
        var listaEntidad= new ArrayList<EntidadTuCompraApp>();
        tuCompraApp.forEach(tuCompraApps -> {
            listaEntidad.add(this.crearEntidad(tuCompraApps));
        });
        return listaEntidad;
    }


}
