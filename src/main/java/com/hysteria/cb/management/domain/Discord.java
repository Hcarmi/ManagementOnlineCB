package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DISCORD")
public class Discord implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idDiscord;

    @Column(name = "PSEUDO")
    private String pseudo;

    @ManyToOne
    @MapsId("idUtilisateur")
    private Utilisateur utilisateur;
}
