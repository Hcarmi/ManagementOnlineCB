package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MAISON")
public class Maison implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idMaison;

    @Column(name = "NAME")
    private String name;
}
