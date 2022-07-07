package com.hysteria.cb.management.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "EVENT_FACTORY")
public class EventFactory implements Serializable {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idEventFactory;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "OWNER")
    private String owner;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "EVENT_DATE_START")
    private Timestamp eventDateStart;

    @Column(name = "EVENT_DATE_REGISTRY")
    private Timestamp eventDateResgistry;

    @Column(name = "EVENT_DATE_CREATED")
    private Timestamp eventDateCreated;

}
