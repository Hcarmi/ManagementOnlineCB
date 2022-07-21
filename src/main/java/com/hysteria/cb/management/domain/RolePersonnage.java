package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Table(name = "ROLE_PERSONNAGE")
@Entity
public class RolePersonnage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRolePersonnage;

    @Column(name = "LIBELLE")
    private String libelle;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToMany
    @JoinTable(name = "PersonnageProfile", joinColumns = @JoinColumn(name = "idRolePersonnage"), inverseJoinColumns = @JoinColumn(name = "idPersonnage"))
    private Set<Personnage> personnages = new HashSet<>();

    public Long getIdRolePersonnage() {
        return idRolePersonnage;
    }

    public void setIdRolePersonnage(Long idRolePersonnage) {
        this.idRolePersonnage = idRolePersonnage;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(Set<Personnage> personnages) {
        this.personnages = personnages;
    }
}
