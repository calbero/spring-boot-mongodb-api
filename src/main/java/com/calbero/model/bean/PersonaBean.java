package com.calbero.model.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <b>Proyect: gastosPiso</b><br>
 * File: PersonaBean.java<br>
 * Date: 11/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@Entity
@Table(name = "persona")
@Getter
@Setter
public class PersonaBean implements Serializable{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre") private String nombre;
    @Column(name = "apellidos") private String apellidos;

    @Transient private Float sumaTotal;

    public String beanToJSON() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }
}
