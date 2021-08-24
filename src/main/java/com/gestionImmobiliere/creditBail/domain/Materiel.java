package com.gestionImmobiliere.creditBail.domain;

import javax.persistence.*;

@Entity
public class Materiel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private CategorieMateriel categorieMateriel;

    private String libelle;

    public Materiel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategorieMateriel getCategorieMateriel() {
        return categorieMateriel;
    }

    public void setCategorieMateriel(CategorieMateriel categorieMateriel) {
        this.categorieMateriel = categorieMateriel;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
