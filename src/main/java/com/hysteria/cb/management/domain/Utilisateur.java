package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idUtilisateur;

    @Column(name = "PSEUDO", nullable = false)
    private String pseudo;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "PAYS", nullable = false)
    private String pays = "France";

    @OneToMany(mappedBy = "utilisateur")
    private Set<Personnage> personnages = new HashSet<>();

    @OneToMany(mappedBy = "utilisateur")
    private Set<Discord> discords = new HashSet<>();

}
