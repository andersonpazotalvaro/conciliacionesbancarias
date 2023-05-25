package co.smart.procesador.datafono.importarcsv;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoDatafono {

    private String nit;
    private String codigo_establecimiento;
    private String origen_de_la_compra;
    private String tipo_de_transaccion;
    private String franquicia;
    private String identificador_de_red;
    private String fecha_de_transaccion;
    private String fecha_de_canje;
    private String cuenta_de_consignacion;
    private String valor_compra;
    private String valor_propina;
    private String valor_iva;
    private String valor_impoconsumo;
    private String valor_total;
    private String valor_comision;
    private String valor_rete_fuente;
    private String valor_rete_iva;
    private String valor_rete_ica;
    private String valor_provision;
    private String valor_neto;
    private String codigo_autorizacion;
    private String tipo_tarjeta;
    private String no_terminal;
    private String tarjeta;
    private String comision_porcentual;
    private String comision_base;
    private String fecha_compensacion;
}
