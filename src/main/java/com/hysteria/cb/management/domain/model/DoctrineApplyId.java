package com.hysteria.cb.management.domain.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;

@Embeddable
public class DoctrineApplyId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idDoctrine;
    private Long idCaserne;

    public DoctrineApplyId() {}

    public DoctrineApplyId(Long idDoctrine, Long idCaserne) {
        super();
        this.idDoctrine = idDoctrine;
        this.idCaserne = idCaserne;
    }

    public Long getIdDoctrine() {
        return idDoctrine;
    }

    public void setIdDoctrine(Long idDoctrine) {
        this.idDoctrine = idDoctrine;
    }

    public Long getIdCaserne() {
        return idCaserne;
    }

    public void setIdCaserne(Long idCaserne) {
        this.idCaserne = idCaserne;
    }
}
