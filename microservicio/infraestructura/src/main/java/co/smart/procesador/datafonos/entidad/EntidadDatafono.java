package co.smart.procesador.datafonos.entidad;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="datafono")
public class EntidadDatafono {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nit;
    private String codigo_establecimiento;
    private String origen_de_la_compra;
    private String tipo_de_transaccion;
    private String franquicia;
    private String identificador_de_red;
    private LocalDate fecha_de_transaccion;
    private LocalDate fecha_de_canje;
    private String cuenta_de_consignacion;
    private float valor_compra;
    private float valor_propina;
    private float valor_iva;
    private float valor_impoconsumo;
    private float valor_total;
    private float valor_comision;
    private float valor_rete_fuente;
    private float valor_rete_iva;
    private float valor_rete_ica;
    private float valor_provision;
    private float valor_neto;
    private String codigo_autorizacion;
    private String tipo_tarjeta;
    private String no_terminal;
    private String tarjeta;
    private String comision_porcentual;
    private float comision_base;
    private String fecha_compensacion;


    public EntidadDatafono(String nit, String codigo_establecimiento, String origen_de_la_compra, String tipo_de_transaccion, String franquicia, String identificador_de_red, LocalDate fecha_de_transaccion, LocalDate fecha_de_canje, String cuenta_de_consignacion, float valor_compra, float valor_propina, float valor_iva, float valor_impoconsumo, float valor_total, float valor_comision, float valor_rete_fuente, float valor_rete_iva, float valor_rete_ica, float valor_provision, float valor_neto, String codigo_autorizacion, String tipo_tarjeta, String no_terminal, String tarjeta, String comision_porcentual, float comision_base, String fecha_compensacion) {
        this.nit = nit;
        this.codigo_establecimiento = codigo_establecimiento;
        this.origen_de_la_compra = origen_de_la_compra;
        this.tipo_de_transaccion = tipo_de_transaccion;
        this.franquicia = franquicia;
        this.identificador_de_red = identificador_de_red;
        this.fecha_de_transaccion = fecha_de_transaccion;
        this.fecha_de_canje = fecha_de_canje;
        this.cuenta_de_consignacion = cuenta_de_consignacion;
        this.valor_compra = valor_compra;
        this.valor_propina = valor_propina;
        this.valor_iva = valor_iva;
        this.valor_impoconsumo = valor_impoconsumo;
        this.valor_total = valor_total;
        this.valor_comision = valor_comision;
        this.valor_rete_fuente = valor_rete_fuente;
        this.valor_rete_iva = valor_rete_iva;
        this.valor_rete_ica = valor_rete_ica;
        this.valor_provision = valor_provision;
        this.valor_neto = valor_neto;
        this.codigo_autorizacion = codigo_autorizacion;
        this.tipo_tarjeta = tipo_tarjeta;
        this.no_terminal = no_terminal;
        this.tarjeta = tarjeta;
        this.comision_porcentual = comision_porcentual;
        this.comision_base = comision_base;
        this.fecha_compensacion = fecha_compensacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCodigo_establecimiento() {
        return codigo_establecimiento;
    }

    public void setCodigo_establecimiento(String codigo_establecimiento) {
        this.codigo_establecimiento = codigo_establecimiento;
    }

    public String getOrigen_de_la_compra() {
        return origen_de_la_compra;
    }

    public void setOrigen_de_la_compra(String origen_de_la_compra) {
        this.origen_de_la_compra = origen_de_la_compra;
    }

    public String getTipo_de_transaccion() {
        return tipo_de_transaccion;
    }

    public void setTipo_de_transaccion(String tipo_de_transaccion) {
        this.tipo_de_transaccion = tipo_de_transaccion;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public String getIdentificador_de_red() {
        return identificador_de_red;
    }

    public void setIdentificador_de_red(String identificador_de_red) {
        this.identificador_de_red = identificador_de_red;
    }

    public LocalDate getFecha_de_transaccion() {
        return fecha_de_transaccion;
    }

    public void setFecha_de_transaccion(LocalDate fecha_de_transaccion) {
        this.fecha_de_transaccion = fecha_de_transaccion;
    }

    public LocalDate getFecha_de_canje() {
        return fecha_de_canje;
    }

    public void setFecha_de_canje(LocalDate fecha_de_canje) {
        this.fecha_de_canje = fecha_de_canje;
    }

    public String getCuenta_de_consignacion() {
        return cuenta_de_consignacion;
    }

    public void setCuenta_de_consignacion(String cuenta_de_consignacion) {
        this.cuenta_de_consignacion = cuenta_de_consignacion;
    }

    public float getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(float valor_compra) {
        this.valor_compra = valor_compra;
    }

    public float getValor_propina() {
        return valor_propina;
    }

    public void setValor_propina(float valor_propina) {
        this.valor_propina = valor_propina;
    }

    public float getValor_iva() {
        return valor_iva;
    }

    public void setValor_iva(float valor_iva) {
        this.valor_iva = valor_iva;
    }

    public float getValor_impoconsumo() {
        return valor_impoconsumo;
    }

    public void setValor_impoconsumo(float valor_impoconsumo) {
        this.valor_impoconsumo = valor_impoconsumo;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public float getValor_comision() {
        return valor_comision;
    }

    public void setValor_comision(float valor_comision) {
        this.valor_comision = valor_comision;
    }

    public float getValor_rete_fuente() {
        return valor_rete_fuente;
    }

    public void setValor_rete_fuente(float valor_rete_fuente) {
        this.valor_rete_fuente = valor_rete_fuente;
    }

    public float getValor_rete_iva() {
        return valor_rete_iva;
    }

    public void setValor_rete_iva(float valor_rete_iva) {
        this.valor_rete_iva = valor_rete_iva;
    }

    public float getValor_rete_ica() {
        return valor_rete_ica;
    }

    public void setValor_rete_ica(float valor_rete_ica) {
        this.valor_rete_ica = valor_rete_ica;
    }

    public float getValor_provision() {
        return valor_provision;
    }

    public void setValor_provision(float valor_provision) {
        this.valor_provision = valor_provision;
    }

    public float getValor_neto() {
        return valor_neto;
    }

    public void setValor_neto(float valor_neto) {
        this.valor_neto = valor_neto;
    }

    public String getCodigo_autorizacion() {
        return codigo_autorizacion;
    }

    public void setCodigo_autorizacion(String codigo_autorizacion) {
        this.codigo_autorizacion = codigo_autorizacion;
    }

    public String getTipo_tarjeta() {
        return tipo_tarjeta;
    }

    public void setTipo_tarjeta(String tipo_tarjeta) {
        this.tipo_tarjeta = tipo_tarjeta;
    }

    public String getNo_terminal() {
        return no_terminal;
    }

    public void setNo_terminal(String no_terminal) {
        this.no_terminal = no_terminal;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getComision_porcentual() {
        return comision_porcentual;
    }

    public void setComision_porcentual(String comision_porcentual) {
        this.comision_porcentual = comision_porcentual;
    }

    public float getComision_base() {
        return comision_base;
    }

    public void setComision_base(float comision_base) {
        this.comision_base = comision_base;
    }

    public String getFecha_compensacion() {
        return fecha_compensacion;
    }

    public void setFecha_compensacion(String fecha_compensacion) {
        this.fecha_compensacion = fecha_compensacion;
    }
}