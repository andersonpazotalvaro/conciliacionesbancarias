package co.smart.procesador.tucompraweb.adaptador;

import co.smart.procesador.tucompraweb.entidad.EntidadTuCompraWeb;
import co.smart.procesador.tucompraweb.modelo.TuCompraWeb;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MapperTuCompraWeb {

    public EntidadTuCompraWeb crearEntidad(TuCompraWeb tuCompraWeb){

        return new EntidadTuCompraWeb(
                tuCompraWeb.getSerialfacturacion(),
                tuCompraWeb.getIdfactura(),
                tuCompraWeb.getMetodo_pago(),
                tuCompraWeb.getBanco(),
                tuCompraWeb.getValor_pagado(),
                tuCompraWeb.getValor_total(),
                tuCompraWeb.getValor_base(),
                tuCompraWeb.getValor_iva(),
                tuCompraWeb.getDescripcion(),
                tuCompraWeb.getDescripcion2(),
                tuCompraWeb.getDetalle(),
                tuCompraWeb.getFecha_pago(),
                tuCompraWeb.getHora_pago(),
                tuCompraWeb.getCodigo_autorizacion(),
                tuCompraWeb.getNumero_tarjeta(),
                tuCompraWeb.getNumero_cuotas(),
                tuCompraWeb.getCorreo_comprador(),
                tuCompraWeb.getNombre_comprador(),
                tuCompraWeb.getApellidos_comprador(),
                tuCompraWeb.getDocumento_comprador(),
                tuCompraWeb.getTelefono_comprador(),
                tuCompraWeb.getDireccion_comprador(),
                tuCompraWeb.getIp_comprador(),
                tuCompraWeb.getCiudad_comprador(),
                tuCompraWeb.getPais_comprador(),
                tuCompraWeb.getEstado_pago(),
                tuCompraWeb.getCausal_rechazo(),
                tuCompraWeb.getNumero_transaccion(),
                tuCompraWeb.getCodigo_seguridad(),
                tuCompraWeb.getTipo_tarjeta(),
                tuCompraWeb.getCategoria_tarjeta(),
                tuCompraWeb.getPais_emisor(),
                tuCompraWeb.getTelefono_banco_emisor(),
                tuCompraWeb.getBanco_recaudador(),
                tuCompraWeb.getCodigo_transaccion(),
                tuCompraWeb.getDescripcion_transaccion(),
                tuCompraWeb.getValorcomision_tucompra(),
                tuCompraWeb.getValorivacomision_tucompra(),
                tuCompraWeb.getCampoextra1(),
                tuCompraWeb.getCampoextra2(),
                tuCompraWeb.getCampoextra3(),
                tuCompraWeb.getCampoextra4(),
                tuCompraWeb.getCampoextra5(),
                tuCompraWeb.getCampoextra6(),
                tuCompraWeb.getCampoextra7(),
                tuCompraWeb.getCampoextra8(),
                tuCompraWeb.getCampoextra9(),
                tuCompraWeb.getCelularcomprador(),
                tuCompraWeb.getEsrecurrencia(),
                tuCompraWeb.getTipocorte(),
                tuCompraWeb.getValor_desembolsado()

        );
    }

    public List<EntidadTuCompraWeb> convertirListaDominioAEntidad(List<TuCompraWeb> tuCompraWebs){
        var listaEntidad= new ArrayList<EntidadTuCompraWeb>();
        tuCompraWebs.forEach(tuCompraWeb -> {
            listaEntidad.add(this.crearEntidad(tuCompraWeb));
        });
        return listaEntidad;
    }


}
