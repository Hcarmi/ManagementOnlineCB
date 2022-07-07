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

    @Column(name = "SERVEUR", nullable = false)
    private String serveur;

    @Column(name = "IMAGE")
    private byte[] image;

    @OneToMany(mappedBy = "personnage")
    private Set<Caserne> casernes =  new HashSet<>();

    @ManyToOne
    @MapsId("idUtilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @MapsId("idMaison")
    private Maison maison;



    // TODO : liaison avec Classe (ManyToMany); SetArmure?;

}
