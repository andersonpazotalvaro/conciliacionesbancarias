package co.smart.procesador.datafonos.adaptador.repositorio;

import co.smart.procesador.datafonos.adaptador.RespuestaConsultaDatafonoJpa;
import co.smart.procesador.datafonos.entidad.EntidadDatafono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEntidadDatafonoJpa extends JpaRepository<EntidadDatafono, Long> {


    @Query(nativeQuery = true,
            value = "Select distinct codigo_autorizacion from conciliaciones.datafono where codigo_autorizacion =:num")
    RespuestaConsultaDatafonoJpa consultarSiExisteRegistro(@Param("num")String num);

}
