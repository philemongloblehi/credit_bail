package com.gestionImmobiliere.creditBail.domain;

import javax.persistence.*;

@Entity
public class Passer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Litige litige;

    @ManyToOne(fetch = FetchType.EAGER)
    private Contrat contrat;

    public Passer() {
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

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }
}
