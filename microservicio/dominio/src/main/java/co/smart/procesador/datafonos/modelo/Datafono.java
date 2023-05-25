package co.smart.procesador.datafonos.modelo;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Datafono {

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

}
