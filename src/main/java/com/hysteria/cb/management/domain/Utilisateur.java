package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;

    @Column(name = "IMAGE")
    private byte[] image;

    @Column(name = "EMAIL")
    private String email;

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

    @ManyToMany
    @JoinTable(name = "UtilisateurProfile", joinColumns = @JoinColumn(name = "idUtilisateur"), inverseJoinColumns = @JoinColumn(name = "idRoleUtilisateur"))
    private Set<RoleUtilisateur> roleUtilisateurs = new HashSet<>();

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Set<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(Set<Personnage> personnages) {
        this.personnages = personnages;
    }

    public Set<Discord> getDiscords() {
        return discords;
    }

    public void setDiscords(Set<Discord> discords) {
        this.discords = discords;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
            "idUtilisateur=" + idUtilisateur +
            ", image=" + Arrays.toString(image) +
            ", email='" + email + '\'' +
            ", pseudo='" + pseudo + '\'' +
            ", password='" + password + '\'' +
            ", pays='" + pays + '\'' +
            '}';
    }
}
