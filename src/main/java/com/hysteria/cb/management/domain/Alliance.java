package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ALLIANCE")
public class Alliance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlliance;

    @Column(name = "NAME")
    private String name;

    @Column(name = "IMAGE")
    private byte[] image;

    @Column(name = "DISCORD_LINK")
    private String discordLink;

    @OneToMany(mappedBy = "alliance")
    private Set<Maison> maisons = new HashSet<>();

    public Long getIdAlliance() {
        return idAlliance;
    }

    public void setIdAlliance(Long idAlliance) {
        this.idAlliance = idAlliance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDiscordLink() {
        return discordLink;
    }

    public void setDiscordLink(String discordLink) {
        this.discordLink = discordLink;
    }

    public Set<Maison> getMaisons() {
        return maisons;
    }

    public void setMaisons(Set<Maison> maisons) {
        this.maisons = maisons;
    }
}
