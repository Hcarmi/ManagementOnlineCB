package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "UNITE")
public class Unite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUnite ;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "Type")
    private String type;

    @Column(name = "TIER")
    private Long tier;

    @Column(name = "FACTION")
    private String faction;

    @Column(name = "IMAGE")
    private byte[] image;

    @Column(name = "ICONE")
    private byte[] icone;

    @Column(name = "INFLUENCE")
    private Long influence;

    @OneToMany(mappedBy = "unite")
    private Set<Caserne> casernes = new HashSet<>();
}
