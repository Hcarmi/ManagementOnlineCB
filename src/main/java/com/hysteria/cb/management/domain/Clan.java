package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CLAN")
public class Clan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClan;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TAG")
    private String tag;

    @Column(name = "IMAGE")
    private byte[] image;

    @Column(name = "OWNER")
    private String owner;

    @OneToMany(mappedBy = "clan")
    private Set<Personnage> personnages = new HashSet<>();

    public Long getIdClan() {
        return idClan;
    }

    public void setIdClan(Long idClan) {
        this.idClan = idClan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Set<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(Set<Personnage> personnages) {
        this.personnages = personnages;
    }
}
