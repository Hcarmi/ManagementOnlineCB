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
    @Column(name = "ID")
    private Long idAlliance;

    @Column(name = "NAME")
    private String name;

    @Column(name = "IMAGE")
    private byte[] image;

    @OneToMany(mappedBy = "alliance")
    private Set<Maison> maisons = new HashSet<>();

}
