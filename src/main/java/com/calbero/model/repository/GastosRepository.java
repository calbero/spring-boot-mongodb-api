package com.calbero.model.repository;

import com.calbero.model.bean.GastosBean;
import com.calbero.model.bean.PersonaBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * <b>Proyect: gastosPiso</b><br>
 * File: GastosRepository.java<br>
 * Date: 11/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */
public interface GastosRepository extends JpaRepository<GastosBean, Long> {

    /**
     * Obtiene el listado de gastos por persona
     * @param personaBean bean persona
     * @return listado gastos
     */
    List<GastosBean> findAllByPersona(PersonaBean personaBean);

    /**
     * Obtiene la suma de gastos por persona
     * @param bean bean persona
     * @return valor total
     */
    @Query("SELECT SUM(cantidad) FROM GastosBean WHERE persona = ?1")
    Float sumCantidadByPersona(PersonaBean bean);

}
