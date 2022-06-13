package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PERSONNAGE")
public class Personnage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idPersonnage;

    @Column(name = "PSEUDO", nullable = false)
    private String pseudo;

    @Column(name = "NIVEAU", nullable = false)
    private Long niveau = 0l;

    @OneToMany(mappedBy = "personnage")
    private Set<Caserne> casernes =  new HashSet<>();

    @ManyToOne
    @MapsId("idUtilisateur")
    private Utilisateur utilisateur;

    // TODO : liaison avec Classe (ManyToMany); SetArmure?; 

}
