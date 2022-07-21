package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "DOCTRINE")
public class Doctrine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDoctrine;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "IMAGE")
    private byte[] image;

    @Column(name = "TIER")
    private String tier;

    @OneToMany(mappedBy = "doctrine")
    private Set<DoctrineApply> doctrineApplies = new HashSet<>();

    public Long getIdDoctrine() {
        return idDoctrine;
    }

    public void setIdDoctrine(Long idDoctrine) {
        this.idDoctrine = idDoctrine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public Set<DoctrineApply> getDoctrineApplies() {
        return doctrineApplies;
    }

    public void setDoctrineApplies(Set<DoctrineApply> doctrineApplies) {
        this.doctrineApplies = doctrineApplies;
    }
}
