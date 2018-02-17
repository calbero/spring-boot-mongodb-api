package com.calbero.model.bean;

import com.sun.istack.internal.Nullable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * <b>Proyect: gastosPiso</b><br>
 * File: GastosBean.java<br>
 * Date: 11/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@Entity
@Table(name = "gastos")
@Getter
@Setter
public class GastosBean implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cantidad") @NotNull private Float cantidad;
    @Column(name = "fecha") @NotNull @Temporal(TemporalType.DATE) private Date fecha;
    @ManyToOne @JoinColumn(name = "id_persona") @NotNull private PersonaBean persona;
    @Column(name = "descripcion") @Nullable private String descripcion;
}
