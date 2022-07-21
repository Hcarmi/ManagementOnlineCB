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

    @Column(name = "DATE_EVENT_CREATED")
    private Timestamp dateEventCreated;

    @Column(name = "DATE_EVENT_START")
    private Timestamp dateEventStart;

    @Column(name = "DATE_EVENT_REGISTRY_LIMIT")
    private Timestamp dateEventRegistryLimit;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMAGE")
    private Byte[] image;

    public Long getIdEventFactory() {
        return idEventFactory;
    }

    public void setIdEventFactory(Long idEventFactory) {
        this.idEventFactory = idEventFactory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getDateEventCreated() {
        return dateEventCreated;
    }

    public void setDateEventCreated(Timestamp dateEventCreated) {
        this.dateEventCreated = dateEventCreated;
    }

    public Timestamp getDateEventStart() {
        return dateEventStart;
    }

    public void setDateEventStart(Timestamp dateEventStart) {
        this.dateEventStart = dateEventStart;
    }

    public Timestamp getDateEventRegistryLimit() {
        return dateEventRegistryLimit;
    }

    public void setDateEventRegistryLimit(Timestamp dateEventRegistryLimit) {
        this.dateEventRegistryLimit = dateEventRegistryLimit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
