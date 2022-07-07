package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "MAISON")
public class Maison implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idMaison;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DISCORD")
    private String discord;

    @Column(name = "IMAGE")
    private byte[] image;

    @ManyToOne
    @MapsId("idAlliance")
    private Alliance alliance;

    @OneToMany(mappedBy = "maison")
    private Set<Personnage> personnages = new HashSet<>();
}
