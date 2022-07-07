package com.hysteria.cb.management.domain;

import com.hysteria.cb.management.domain.model.EventId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EVENT")
public class Event implements Serializable {

    @EmbeddedId
    private EventId idEvent = new EventId();
}
