package co.smart.procesador.tucompraweb.adaptador.repositorio;

import co.smart.procesador.tucompraweb.adaptador.RespuestaConsultaJpa;
import co.smart.procesador.tucompraweb.entidad.EntidadTuCompraWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.beans.Transient;
import java.util.List;

@Repository
public interface RepositorioEntidadTuCompraWebJpa extends JpaRepository<EntidadTuCompraWeb, Long> {

    @Query(nativeQuery = true,
            value = "Select distinct numero_transaccion from conciliaciones.tu_compra_web where numero_transaccion =:num")
    RespuestaConsultaJpa consultarSiExisteRegistro(@Param("num")String num);

}
