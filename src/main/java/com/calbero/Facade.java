package com.calbero;

import com.calbero.model.bean.GastosBean;
import com.calbero.model.bean.PersonaBean;
import com.calbero.model.service.GastosService;
import com.calbero.model.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <b>Proyect: gastosPiso</b><br>
 * File: Facade.java<br>
 * Date: 11/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@Component
public class Facade {

    private final GastosService gastosService;
    private final PersonaService personaService;

    @Autowired
    public Facade(GastosService gastosService, PersonaService personaService) {
        this.gastosService = gastosService;
        this.personaService = personaService;
    }

    public List<GastosBean> findAllGastos() {
        return gastosService.findAllGastos();
    }

    public List<GastosBean> findAllGastosByPersona(PersonaBean persona) {
        return gastosService.findAllGastosByPersona(persona);
    }
    public GastosBean saveGasto(GastosBean gasto) {
        return gastosService.saveGasto(gasto);
    }

    public List<PersonaBean> findAllPersona() {
        return personaService.findAllPersona();
    }

    public PersonaBean findPersonaById(Long id) {
        return personaService.findPersonaById(id);
    }

    public Float sumCantidadByPersona(PersonaBean bean) {
        return gastosService.sumCantidadByPersona(bean);
    }
}
