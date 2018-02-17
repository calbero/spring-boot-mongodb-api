package com.calbero.model.repository;

import com.calbero.model.bean.PersonaBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <b>Proyect: gastosPiso</b><br>
 * File: PersonaRepository.java<br>
 * Date: 11/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */
public interface PersonaRepository extends JpaRepository<PersonaBean,Long> {

    /**
     * Busca una persona por el id
     * @param id el id
     * @return la persona
     */
    PersonaBean findById(Long id);
}
