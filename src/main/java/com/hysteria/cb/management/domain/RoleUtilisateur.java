package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ROLE_UTILISATEUR")
public class RoleUtilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRoleUtilisateur;

    @Column(name = "LIBELLE")
    private String libelle;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToMany
    @JoinTable(name = "UtilisateurProfile", joinColumns = @JoinColumn(name = "idRoleUtilisateur"), inverseJoinColumns = @JoinColumn(name = "idUtilisateur"))
    private Set<Utilisateur> utilisateurs = new HashSet<>();

    public Long getIdRoleUtilisateur() {
        return idRoleUtilisateur;
    }

    public void setIdRoleUtilisateur(Long idRoleUtilisateur) {
        this.idRoleUtilisateur = idRoleUtilisateur;
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

    public Set<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}
