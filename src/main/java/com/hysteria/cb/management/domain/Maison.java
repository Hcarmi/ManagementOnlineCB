package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "MAISON")
public class Maison implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaison;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DISCORD_LINK")
    private String discordLink;

    @Column(name = "IMAGE")
    private byte[] image;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "idAlliance")
    //@MapsId("idAlliance")
    private Alliance alliance;

    @OneToMany(mappedBy = "maison")
    private Set<Personnage> personnages = new HashSet<>();

    @OneToMany(mappedBy = "maison")
    private Set<Armee> armees = new HashSet<>();

    public Long getIdMaison() {
        return idMaison;
    }

    public void setIdMaison(Long idMaison) {
        this.idMaison = idMaison;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscordLink() {
        return discordLink;
    }

    public void setDiscordLink(String discordLink) {
        this.discordLink = discordLink;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Alliance getAlliance() {
        return alliance;
    }

    public void setAlliance(Alliance alliance) {
        this.alliance = alliance;
    }

    public Set<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(Set<Personnage> personnages) {
        this.personnages = personnages;
    }

    public Set<Armee> getArmees() {
        return armees;
    }

    public void setArmees(Set<Armee> armees) {
        this.armees = armees;
    }
}
