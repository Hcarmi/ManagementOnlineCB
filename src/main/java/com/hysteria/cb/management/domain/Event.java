package com.hysteria.cb.management.domain;

import com.hysteria.cb.management.domain.model.EventId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EVENT")
public class Event implements Serializable {

    @EmbeddedId
    private EventId idEvent = new EventId();

    @ManyToOne
    @MapsId("idPersonnage")
    private Personnage personnage;

    @ManyToOne
    @MapsId("idEventFactory")
    private EventFactory eventFactory;

    @Column(name = "ARMEE")
    private String armee;

    @Column(name = "GROUPE")
    private String groupe;

   @Column(name = "PRESENCE_SUPPOSED")
    private String presenceSupposed;

    @Column(name = "PRESENCE_REAL")
    private String presenceReal;

    public EventId getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(EventId idEvent) {
        this.idEvent = idEvent;
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public EventFactory getEventFactory() {
        return eventFactory;
    }

    public void setEventFactory(EventFactory eventFactory) {
        this.eventFactory = eventFactory;
    }

    public String getArmee() {
        return armee;
    }

    public void setArmee(String armee) {
        this.armee = armee;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getPresenceSupposed() {
        return presenceSupposed;
    }

    public void setPresenceSupposed(String presenceSupposed) {
        this.presenceSupposed = presenceSupposed;
    }

    public String getPresenceReal() {
        return presenceReal;
    }

    public void setPresenceReal(String presenceReal) {
        this.presenceReal = presenceReal;
    }
}
