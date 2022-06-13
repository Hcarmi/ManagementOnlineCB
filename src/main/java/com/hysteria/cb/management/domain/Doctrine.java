package com.hysteria.cb.management.domain;

import javax.persistence.*;
import java.io.Serializable;

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

}
