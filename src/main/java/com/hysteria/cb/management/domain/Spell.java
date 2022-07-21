package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SPELL")
public class Spell implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSpell;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION_STR")
    private String descriptionStr;

    @Column(name = "DESCRIPTION")
    private byte[] description;

    @ManyToOne
    @MapsId("idClasse")
    private Classe classe;


}
