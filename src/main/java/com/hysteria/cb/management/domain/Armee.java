package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ARMEE")
public class Armee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArmee;

    @Column(name = "NAME")
    private String name;

    @Column(name = "OWNER")
    private String owner;

    @ManyToOne
    @JoinColumn(name = "idMaison")
    private Maison maison;

    public Long getIdArmee() {
        return idArmee;
    }

    public void setIdArmee(Long idArmee) {
        this.idArmee = idArmee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Maison getMaison() {
        return maison;
    }

    public void setMaison(Maison maison) {
        this.maison = maison;
    }
}
