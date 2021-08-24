package com.gestionImmobiliere.creditBail.domain;

import javax.persistence.*;

@Entity
public class SocieteAcquerante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

    @ManyToOne(fetch = FetchType.EAGER)
    private Banque banque;

    public SocieteAcquerante() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }
}
