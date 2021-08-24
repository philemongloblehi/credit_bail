package com.gestionImmobiliere.creditBail.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private SocieteAcquerante societeAcquerante;

    @ManyToOne(fetch = FetchType.EAGER)
    private Fonction fonction;

    private String nom;
    private LocalDate dateNaissance;

    public Agent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SocieteAcquerante getSociete() {
        return societeAcquerante;
    }

    public void setSociete(SocieteAcquerante societeAcquerante) {
        this.societeAcquerante = societeAcquerante;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
