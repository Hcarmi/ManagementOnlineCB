package com.hysteria.cb.management.domain;

import com.hysteria.cb.management.domain.model.DoctrineApplyId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DOCTRINE_APPLY")
public class DoctrineApply implements Serializable {

    @EmbeddedId
    private DoctrineApplyId idDoctrineApply;

    @Column(name = "STATUS")
    private String status;

    @ManyToOne
    @MapsId("idDoctrine")
    private Doctrine doctrine;

    @ManyToOne
    @MapsId("idCaserne")
    private Caserne caserne;

    public DoctrineApplyId getIdDoctrineApply() {
        return idDoctrineApply;
    }

    public void setIdDoctrineApply(DoctrineApplyId idDoctrineApply) {
        this.idDoctrineApply = idDoctrineApply;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Doctrine getDoctrine() {
        return doctrine;
    }

    public void setDoctrine(Doctrine doctrine) {
        this.doctrine = doctrine;
    }

    public Caserne getCaserne() {
        return caserne;
    }

    public void setCaserne(Caserne caserne) {
        this.caserne = caserne;
    }
}
