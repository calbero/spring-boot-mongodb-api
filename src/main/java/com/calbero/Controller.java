package com.calbero;

import com.calbero.model.bean.GastosBean;
import com.calbero.model.bean.PersonaBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <b>Proyect: gastosPiso</b><br>
 * File: Controller.java<br>
 * Date: 11/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@RestController
public class Controller {

    private final Facade facade;

    @Autowired
    public Controller(Facade facade) {
        this.facade = facade;
    }

    @GetMapping("/personas")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public Collection<PersonaBean> getPersonas() {
        return facade.findAllPersona();
    }

    @PostMapping("/saveGasto")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public GastosBean saveGasto (@RequestBody GastosBean bean) {
        return facade.saveGasto(bean);
    }

    @GetMapping("/gastos")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public Collection<GastosBean> getGastos() {
        return facade.findAllGastos();
    }

    @GetMapping("/balance")
    @CrossOrigin(origins = {"http://localhost:8100", "file://"})
    public List<PersonaBean> getBalance() throws JsonProcessingException {
        List<PersonaBean> retList = new ArrayList<>();
        List<PersonaBean> personas = facade.findAllPersona();
        for (PersonaBean persona : personas) {
            persona.setSumaTotal(facade.sumCantidadByPersona(persona));
            retList.add(persona);
        }
        return retList;
    }
}
