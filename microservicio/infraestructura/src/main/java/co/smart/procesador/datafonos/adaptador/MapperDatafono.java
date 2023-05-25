package co.smart.procesador.datafonos.adaptador;

import co.smart.procesador.datafonos.entidad.EntidadDatafono;
import co.smart.procesador.datafonos.modelo.Datafono;
import co.smart.procesador.tucompraapp.entidad.EntidadTuCompraApp;
import co.smart.procesador.tucompraapp.modelo.TuCompraApp;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MapperDatafono {

    public EntidadDatafono crearEntidad(Datafono datafono){

        return new EntidadDatafono(
                datafono.getNit(),
                datafono.getCodigo_establecimiento(),
                datafono.getOrigen_de_la_compra(),
                datafono.getTipo_de_transaccion(),
                datafono.getFranquicia(),
                datafono.getIdentificador_de_red(),
                datafono.getFecha_de_transaccion(),
                datafono.getFecha_de_canje(),
                datafono.getCuenta_de_consignacion(),
                datafono.getValor_compra(),
                datafono.getValor_propina(),
                datafono.getValor_iva(),
                datafono.getValor_impoconsumo(),
                datafono.getValor_total(),
                datafono.getValor_comision(),
                datafono.getValor_rete_fuente(),
                datafono.getValor_rete_iva(),
                datafono.getValor_rete_ica(),
                datafono.getValor_provision(),
                datafono.getValor_neto(),
                datafono.getCodigo_autorizacion(),
                datafono.getTipo_tarjeta(),
                datafono.getNo_terminal(),
                datafono.getTarjeta(),
                datafono.getComision_porcentual(),
                datafono.getComision_base(),
                datafono.getFecha_compensacion()

        );
    }

    public List<EntidadDatafono> convertirListaDominioAEntidad(List<Datafono> datafonos){
        var listaEntidad= new ArrayList<EntidadDatafono>();
        datafonos.forEach(datafono -> {
            listaEntidad.add(this.crearEntidad(datafono));
        });
        return listaEntidad;
    }


}
