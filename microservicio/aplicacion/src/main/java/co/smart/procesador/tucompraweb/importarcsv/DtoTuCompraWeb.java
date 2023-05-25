package co.smart.procesador.tucompraweb.importarcsv;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoTuCompraWeb {

    private String serialfacturacion;
    private String idfactura;
    private String metodo_pago;
    private String banco;
    private String valor_pagado;
    private String valor_total;
    private String valor_base;
    private String valor_iva;
    private String descripcion;
    private String descripcion2;
    private String detalle;
    private String fecha_pago;
    private String hora_pago;
    private String codigo_autorizacion;
    private String numero_tarjeta;
    private String numero_cuotas;
    private String correo_comprador;
    private String nombre_comprador;
    private String apellidos_comprador;
    private String documento_comprador;
    private String telefono_comprador;
    private String direccion_comprador;
    private String ip_comprador;
    private String ciudad_comprador;
    private String pais_comprador;
    private String estado_pago;
    private String Causal_rechazo;
    private String numero_transaccion;
    private String codigo_seguridad;
    private String tipo_tarjeta;
    private String categoria_tarjeta;
    private String pais_emisor;
    private String telefono_banco_emisor;
    private String banco_recaudador;
    private String codigo_transaccion;
    private String descripcion_transaccion;
    private String valorcomision_tucompra;
    private String valorivacomision_tucompra;
    private String campoextra1;
    private String campoextra2;
    private String campoextra3;
    private String campoextra4;
    private String campoextra5;
    private String campoextra6;
    private String campoextra7;
    private String campoextra8;
    private String campoextra9;
    private String celularcomprador;
    private String esrecurrencia;
    private String tipocorte;
    private String valor_desembolsado;
}
