package com.gestionImmobiliere.creditBail.domain;

import javax.persistence.*;

@Entity
public class Litige {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private TypeLitige typeLitige;

    private String cause;

    public Litige() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeLitige getTypeLitige() {
        return typeLitige;
    }

    public void setTypeLitige(TypeLitige typeLitige) {
        this.typeLitige = typeLitige;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
