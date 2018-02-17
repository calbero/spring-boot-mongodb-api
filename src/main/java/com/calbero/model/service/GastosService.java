package com.calbero.model.service;

import com.calbero.model.bean.GastosBean;
import com.calbero.model.bean.PersonaBean;
import com.calbero.model.repository.GastosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <b>Proyect: gastosPiso</b><br>
 * File: GastosService.java<br>
 * Date: 11/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@Service
public class GastosService {

    private final GastosRepository repository;

    @Autowired
    public GastosService(GastosRepository repository) {
        this.repository = repository;
    }

    public List<GastosBean> findAllGastos() {
        return repository.findAll();
    }

    public GastosBean saveGasto(GastosBean bean) {
        return repository.save(bean);
    }

    public List<GastosBean> findAllGastosByPersona(PersonaBean persona) {
        return repository.findAllByPersona(persona);
    }

    public Float sumCantidadByPersona(PersonaBean persona) {
        return repository.sumCantidadByPersona(persona);
    }

}
