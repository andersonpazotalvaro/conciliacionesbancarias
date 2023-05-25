package co.smart.procesador.tucompraapp.adaptador.repositorio;

import co.smart.procesador.tucompraapp.entidad.EntidadTuCompraApp;
import co.smart.procesador.tucompraweb.adaptador.RespuestaConsultaJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEntidadTuCompraAppJpa extends JpaRepository<EntidadTuCompraApp, Long> {


    @Query(nativeQuery = true,
            value = "Select distinct numero_transaccion from conciliaciones.tu_compra_app where numero_transaccion =:num")
    RespuestaConsultaJpa consultarSiExisteRegistro(@Param("num")String num);

}
