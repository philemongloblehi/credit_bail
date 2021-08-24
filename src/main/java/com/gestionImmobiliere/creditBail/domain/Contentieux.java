package com.gestionImmobiliere.creditBail.domain;

import javax.persistence.*;

@Entity
public class Contentieux {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Litige litige;

    public Contentieux() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Litige getLitige() {
        return litige;
    }

    public void setLitige(Litige litige) {
        this.litige = litige;
    }
}
