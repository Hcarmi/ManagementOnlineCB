package com.hysteria.cb.management.domain.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EventId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idEventFactory ;

    private Long idPersonnage ;

    public EventId() {}

    public EventId(Long idEventFactory, Long idPersonnage) {
        super();
        this.idEventFactory = idEventFactory;
        this.idPersonnage = idPersonnage;
    }

    public Long getIdPersonnage() {
        return idPersonnage;
    }

    public void setIdPersonnage(Long idPersonnage) {
        this.idPersonnage = idPersonnage;
    }

    public Long getIdEventFactory() {
        return idEventFactory;
    }

    public void setIdEventFactory(Long idEventFactory) {
        this.idEventFactory = idEventFactory;
    }
}
