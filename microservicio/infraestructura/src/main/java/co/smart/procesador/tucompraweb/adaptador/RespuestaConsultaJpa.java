package co.smart.procesador.tucompraweb.adaptador;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class RespuestaConsultaJpa {
    private String numero_transaccion;

    public RespuestaConsultaJpa(String numero_transaccion) {
        this.numero_transaccion = numero_transaccion;
    }

    public RespuestaConsultaJpa() {
    }
}
