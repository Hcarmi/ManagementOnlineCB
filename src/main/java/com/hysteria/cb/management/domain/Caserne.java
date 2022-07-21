package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CASERNE")
public class Caserne implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCaserne;

    @ManyToOne
    @MapsId("idUnite")
    private Unite unite;

    @ManyToOne
    @MapsId("idPersonnage")
    private Personnage personnage;

    @Column(name = "NIVEAU", nullable = false)
    private Long niveau = 0l;

    @Column(name = "AFFECTION", nullable = false)
    private Long affection = 0l;

    @Column(name = "EFFICACITE", nullable = false)
    private Long efficacite = 0l;

    @OneToMany(mappedBy = "caserne")
    private Set<DoctrineApply> doctrineApplies = new HashSet<>();

    public Long getIdCaserne() {
        return idCaserne;
    }

    public void setIdCaserne(Long idCaserne) {
        this.idCaserne = idCaserne;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public Long getNiveau() {
        return niveau;
    }

    public void setNiveau(Long niveau) {
        this.niveau = niveau;
    }

    public Long getAffection() {
        return affection;
    }

    public void setAffection(Long affection) {
        this.affection = affection;
    }

    public Long getEfficacite() {
        return efficacite;
    }

    public void setEfficacite(Long efficacite) {
        this.efficacite = efficacite;
    }

    public Set<DoctrineApply> getDoctrineApplies() {
        return doctrineApplies;
    }

    public void setDoctrineApplies(Set<DoctrineApply> doctrineApplies) {
        this.doctrineApplies = doctrineApplies;
    }
}
