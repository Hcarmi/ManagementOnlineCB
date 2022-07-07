package com.hysteria.cb.management.domain;

import com.hysteria.cb.management.domain.model.CaserneId;

import javax.persistence.*;

@Entity
@Table(name = "CASERNE")
public class Caserne {

    @EmbeddedId
    private CaserneId idCaserne = new CaserneId();

    @ManyToOne
    @MapsId("idPersonnage")
    private Personnage personnage;

    @ManyToOne
    @MapsId("idUnite")
    private Unite unite;

    @Column(name = "NIVEAU", nullable = false)
    private Long niveau = 0l;

    // TODO : ajout liaison doctrine : ManyToMany et ajout attribut : activated
}
