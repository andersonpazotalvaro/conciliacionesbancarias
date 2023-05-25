package co.smart.procesador.tucompraapp.entidad;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity

@Table(name="tu_compra_app")
public class EntidadTuCompraApp {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE )
    private Long id;
    private Long serialfacturacion;
    private String idfactura;
    private String metodo_pago;
    private String banco;
    private int valor_pagado;
    private int valor_total;
    private int valor_base;
    private int valor_iva;
    private String descripcion;
    private String descripcion2;
    private String detalle;
    private LocalDateTime fecha_pago;
    private LocalTime hora_pago;
    private String codigo_autorizacion;
    private String numero_tarjeta;
    private int numero_cuotas;
    private String correo_comprador;
    private String nombre_comprador;
    private String apellidos_comprador;
    private String documento_comprador;
    private String telefono_comprador;
    private String direccion_comprador;
    private String ip_comprador;
    private int ciudad_comprador;
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
    private int valorcomision_tucompra;
    private int valorivacomision_tucompra;
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
    private float valor_desembolsado;

    public EntidadTuCompraApp(Long serialfacturacion, String idfactura, String metodo_pago, String banco, int valor_pagado, int valor_total, int valor_base, int valor_iva, String descripcion, String descripcion2, String detalle, LocalDateTime fecha_pago, LocalTime hora_pago, String codigo_autorizacion, String numero_tarjeta, int numero_cuotas, String correo_comprador, String nombre_comprador, String apellidos_comprador, String documento_comprador, String telefono_comprador, String direccion_comprador, String ip_comprador, int ciudad_comprador, String pais_comprador, String estado_pago, String causal_rechazo, String numero_transaccion, String codigo_seguridad, String tipo_tarjeta, String categoria_tarjeta, String pais_emisor, String telefono_banco_emisor, String banco_recaudador, String codigo_transaccion, String descripcion_transaccion, int valorcomision_tucompra, int valorivacomision_tucompra, String campoextra1, String campoextra2, String campoextra3, String campoextra4, String campoextra5, String campoextra6, String campoextra7, String campoextra8, String campoextra9, String celularcomprador, String esrecurrencia, String tipocorte, float valor_desembolsado) {
        this.serialfacturacion = serialfacturacion;
        this.idfactura = idfactura;
        this.metodo_pago = metodo_pago;
        this.banco = banco;
        this.valor_pagado = valor_pagado;
        this.valor_total = valor_total;
        this.valor_base = valor_base;
        this.valor_iva = valor_iva;
        this.descripcion = descripcion;
        this.descripcion2 = descripcion2;
        this.detalle = detalle;
        this.fecha_pago = fecha_pago;
        this.hora_pago = hora_pago;
        this.codigo_autorizacion = codigo_autorizacion;
        this.numero_tarjeta = numero_tarjeta;
        this.numero_cuotas = numero_cuotas;
        this.correo_comprador = correo_comprador;
        this.nombre_comprador = nombre_comprador;
        this.apellidos_comprador = apellidos_comprador;
        this.documento_comprador = documento_comprador;
        this.telefono_comprador = telefono_comprador;
        this.direccion_comprador = direccion_comprador;
        this.ip_comprador = ip_comprador;
        this.ciudad_comprador = ciudad_comprador;
        this.pais_comprador = pais_comprador;
        this.estado_pago = estado_pago;
        Causal_rechazo = causal_rechazo;
        this.numero_transaccion = numero_transaccion;
        this.codigo_seguridad = codigo_seguridad;
        this.tipo_tarjeta = tipo_tarjeta;
        this.categoria_tarjeta = categoria_tarjeta;
        this.pais_emisor = pais_emisor;
        this.telefono_banco_emisor = telefono_banco_emisor;
        this.banco_recaudador = banco_recaudador;
        this.codigo_transaccion = codigo_transaccion;
        this.descripcion_transaccion = descripcion_transaccion;
        this.valorcomision_tucompra = valorcomision_tucompra;
        this.valorivacomision_tucompra = valorivacomision_tucompra;
        this.campoextra1 = campoextra1;
        this.campoextra2 = campoextra2;
        this.campoextra3 = campoextra3;
        this.campoextra4 = campoextra4;
        this.campoextra5 = campoextra5;
        this.campoextra6 = campoextra6;
        this.campoextra7 = campoextra7;
        this.campoextra8 = campoextra8;
        this.campoextra9 = campoextra9;
        this.celularcomprador = celularcomprador;
        this.esrecurrencia = esrecurrencia;
        this.tipocorte = tipocorte;
        this.valor_desembolsado = valor_desembolsado;
    }

    public Long getSerialfacturacion() {
        return serialfacturacion;
    }

    public void setSerialfacturacion(Long serialfacturacion) {
        this.serialfacturacion = serialfacturacion;
    }

    public String getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(String idfactura) {
        this.idfactura = idfactura;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getValor_pagado() {
        return valor_pagado;
    }

    public void setValor_pagado(int valor_pagado) {
        this.valor_pagado = valor_pagado;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    public int getValor_base() {
        return valor_base;
    }

    public void setValor_base(int valor_base) {
        this.valor_base = valor_base;
    }

    public int getValor_iva() {
        return valor_iva;
    }

    public void setValor_iva(int valor_iva) {
        this.valor_iva = valor_iva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public LocalDateTime getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDateTime fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public LocalTime getHora_pago() {
        return hora_pago;
    }

    public void setHora_pago(LocalTime hora_pago) {
        this.hora_pago = hora_pago;
    }

    public String getCodigo_autorizacion() {
        return codigo_autorizacion;
    }

    public void setCodigo_autorizacion(String codigo_autorizacion) {
        this.codigo_autorizacion = codigo_autorizacion;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public int getNumero_cuotas() {
        return numero_cuotas;
    }

    public void setNumero_cuotas(int numero_cuotas) {
        this.numero_cuotas = numero_cuotas;
    }

    public String getCorreo_comprador() {
        return correo_comprador;
    }

    public void setCorreo_comprador(String correo_comprador) {
        this.correo_comprador = correo_comprador;
    }

    public String getNombre_comprador() {
        return nombre_comprador;
    }

    public void setNombre_comprador(String nombre_comprador) {
        this.nombre_comprador = nombre_comprador;
    }

    public String getApellidos_comprador() {
        return apellidos_comprador;
    }

    public void setApellidos_comprador(String apellidos_comprador) {
        this.apellidos_comprador = apellidos_comprador;
    }

    public String getDocumento_comprador() {
        return documento_comprador;
    }

    public void setDocumento_comprador(String documento_comprador) {
        this.documento_comprador = documento_comprador;
    }

    public String getTelefono_comprador() {
        return telefono_comprador;
    }

    public void setTelefono_comprador(String telefono_comprador) {
        this.telefono_comprador = telefono_comprador;
    }

    public String getDireccion_comprador() {
        return direccion_comprador;
    }

    public void setDireccion_comprador(String direccion_comprador) {
        this.direccion_comprador = direccion_comprador;
    }

    public String getIp_comprador() {
        return ip_comprador;
    }

    public void setIp_comprador(String ip_comprador) {
        this.ip_comprador = ip_comprador;
    }

    public int getCiudad_comprador() {
        return ciudad_comprador;
    }

    public void setCiudad_comprador(int ciudad_comprador) {
        this.ciudad_comprador = ciudad_comprador;
    }

    public String getPais_comprador() {
        return pais_comprador;
    }

    public void setPais_comprador(String pais_comprador) {
        this.pais_comprador = pais_comprador;
    }

    public String getEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    public String getCausal_rechazo() {
        return Causal_rechazo;
    }

    public void setCausal_rechazo(String causal_rechazo) {
        Causal_rechazo = causal_rechazo;
    }

    public String getNumero_transaccion() {
        return numero_transaccion;
    }

    public void setNumero_transaccion(String numero_transaccion) {
        this.numero_transaccion = numero_transaccion;
    }

    public String getCodigo_seguridad() {
        return codigo_seguridad;
    }

    public void setCodigo_seguridad(String codigo_seguridad) {
        this.codigo_seguridad = codigo_seguridad;
    }

    public String getTipo_tarjeta() {
        return tipo_tarjeta;
    }

    public void setTipo_tarjeta(String tipo_tarjeta) {
        this.tipo_tarjeta = tipo_tarjeta;
    }

    public String getCategoria_tarjeta() {
        return categoria_tarjeta;
    }

    public void setCategoria_tarjeta(String categoria_tarjeta) {
        this.categoria_tarjeta = categoria_tarjeta;
    }

    public String getPais_emisor() {
        return pais_emisor;
    }

    public void setPais_emisor(String pais_emisor) {
        this.pais_emisor = pais_emisor;
    }

    public String getTelefono_banco_emisor() {
        return telefono_banco_emisor;
    }

    public void setTelefono_banco_emisor(String telefono_banco_emisor) {
        this.telefono_banco_emisor = telefono_banco_emisor;
    }

    public String getBanco_recaudador() {
        return banco_recaudador;
    }

    public void setBanco_recaudador(String banco_recaudador) {
        this.banco_recaudador = banco_recaudador;
    }

    public String getCodigo_transaccion() {
        return codigo_transaccion;
    }

    public void setCodigo_transaccion(String codigo_transaccion) {
        this.codigo_transaccion = codigo_transaccion;
    }

    public String getDescripcion_transaccion() {
        return descripcion_transaccion;
    }

    public void setDescripcion_transaccion(String descripcion_transaccion) {
        this.descripcion_transaccion = descripcion_transaccion;
    }

    public int getValorcomision_tucompra() {
        return valorcomision_tucompra;
    }

    public void setValorcomision_tucompra(int valorcomision_tucompra) {
        this.valorcomision_tucompra = valorcomision_tucompra;
    }

    public int getValorivacomision_tucompra() {
        return valorivacomision_tucompra;
    }

    public void setValorivacomision_tucompra(int valorivacomision_tucompra) {
        this.valorivacomision_tucompra = valorivacomision_tucompra;
    }

    public String getCampoextra1() {
        return campoextra1;
    }

    public void setCampoextra1(String campoextra1) {
        this.campoextra1 = campoextra1;
    }

    public String getCampoextra2() {
        return campoextra2;
    }

    public void setCampoextra2(String campoextra2) {
        this.campoextra2 = campoextra2;
    }

    public String getCampoextra3() {
        return campoextra3;
    }

    public void setCampoextra3(String campoextra3) {
        this.campoextra3 = campoextra3;
    }

    public String getCampoextra4() {
        return campoextra4;
    }

    public void setCampoextra4(String campoextra4) {
        this.campoextra4 = campoextra4;
    }

    public String getCampoextra5() {
        return campoextra5;
    }

    public void setCampoextra5(String campoextra5) {
        this.campoextra5 = campoextra5;
    }

    public String getCampoextra6() {
        return campoextra6;
    }

    public void setCampoextra6(String campoextra6) {
        this.campoextra6 = campoextra6;
    }

    public String getCampoextra7() {
        return campoextra7;
    }

    public void setCampoextra7(String campoextra7) {
        this.campoextra7 = campoextra7;
    }

    public String getCampoextra8() {
        return campoextra8;
    }

    public void setCampoextra8(String campoextra8) {
        this.campoextra8 = campoextra8;
    }

    public String getCampoextra9() {
        return campoextra9;
    }

    public void setCampoextra9(String campoextra9) {
        this.campoextra9 = campoextra9;
    }

    public String getCelularcomprador() {
        return celularcomprador;
    }

    public void setCelularcomprador(String celularcomprador) {
        this.celularcomprador = celularcomprador;
    }

    public String getEsrecurrencia() {
        return esrecurrencia;
    }

    public void setEsrecurrencia(String esrecurrencia) {
        this.esrecurrencia = esrecurrencia;
    }

    public String getTipocorte() {
        return tipocorte;
    }

    public void setTipocorte(String tipocorte) {
        this.tipocorte = tipocorte;
    }

    public float getValor_desembolsado() {
        return valor_desembolsado;
    }

    public void setValor_desembolsado(float valor_desembolsado) {
        this.valor_desembolsado = valor_desembolsado;
    }
}
