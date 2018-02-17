package com.calbero.model.service;

import com.calbero.model.bean.PersonaBean;
import com.calbero.model.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <b>Proyect: gastosPiso</b><br>
 * File: PersonaService.java<br>
 * Date: 11/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@Service
public class PersonaService {

    private final PersonaRepository repository;

    @Autowired
    public PersonaService(PersonaRepository repository) {
        this.repository = repository;
    }

    public List<PersonaBean> findAllPersona() {
        return repository.findAll();
    }

    public PersonaBean findPersonaById(Long id) {
        return repository.findById(id);
    }
}
