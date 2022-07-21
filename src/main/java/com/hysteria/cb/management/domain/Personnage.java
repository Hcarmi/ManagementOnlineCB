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
    private Long idPersonnage;

    @Column(name = "PSEUDO", nullable = false)
    private String pseudo;

    @Column(name = "NIVEAU", nullable = false)
    private Long niveau = 0l;

    @Column(name = "SERVEUR", nullable = false)
    private String serveur;

    @Column(name = "IMAGE")
    private byte[] image;

    @Column(name = "TITRE")
    private String titre;

    @OneToMany(mappedBy = "personnage")
    private Set<Caserne> casernes =  new HashSet<>();

    @ManyToOne
    @MapsId("idUtilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "idMaison")
    private Maison maison;

    @ManyToMany
    @JoinTable(name = "PersonnageProfile", joinColumns = @JoinColumn(name = "idPersonnage"), inverseJoinColumns = @JoinColumn(name = "idRolePersonnage"))
    private Set<RolePersonnage> rolePersonnages = new HashSet<>();

    @ManyToOne
    @JoinTable(name = "idClan")
    private Clan clan;

    public Long getIdPersonnage() {
        return idPersonnage;
    }

    public void setIdPersonnage(Long idPersonnage) {
        this.idPersonnage = idPersonnage;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Long getNiveau() {
        return niveau;
    }

    public void setNiveau(Long niveau) {
        this.niveau = niveau;
    }

    public String getServeur() {
        return serveur;
    }

    public void setServeur(String serveur) {
        this.serveur = serveur;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Set<Caserne> getCasernes() {
        return casernes;
    }

    public void setCasernes(Set<Caserne> casernes) {
        this.casernes = casernes;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Maison getMaison() {
        return maison;
    }

    public void setMaison(Maison maison) {
        this.maison = maison;
    }

    public Set<RolePersonnage> getRolePersonnages() {
        return rolePersonnages;
    }

    public void setRolePersonnages(Set<RolePersonnage> rolePersonnages) {
        this.rolePersonnages = rolePersonnages;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    // TODO : liaison avec Classe (ManyToMany); SetArmure?;

}
