package com.hysteria.cb.management.domain.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CaserneId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idPersonnage;

    private Long idUnite;

    public CaserneId() {}

    public CaserneId(Long idPersonnage, Long idUnite) {
        super();
        this.idPersonnage = idPersonnage;
        this.idUnite = idUnite;
    }

    public Long getIdPersonnage() {
        return idPersonnage;
    }

    public void setIdPersonnage(Long idPersonnage) {
        this.idPersonnage = idPersonnage;
    }

    public Long getIdUnite() {
        return idUnite;
    }

    public void setIdUnite(Long idUnite) {
        this.idUnite = idUnite;
    }
}
