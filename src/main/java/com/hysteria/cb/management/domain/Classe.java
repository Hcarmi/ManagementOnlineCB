package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CLASSE")
public class Classe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClasse;

    @Column(name = "NAME")
    private String name;

    // Type = medium, light, heavy OU range, cac OU DPS, bruiser, tank, support ?
    @Column(name = "TYPE")
    private String type;

    @Column(name = "DESCRIPTION")
    private String description;


}
