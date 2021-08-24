package com.gestionImmobiliere.creditBail.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Achat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Fournisseur fournisseur;

    @ManyToOne(fetch = FetchType.EAGER)
    private Agent agent;

    @ManyToOne(fetch = FetchType.EAGER)
    private Materiel materiel;
//    private Facture facture;
    private LocalDate date;
    private double quantite;
    private int prix;

    public Achat() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

//    public Facture getFacture() {
//        return facture;
//    }
//
//    public void setFacture(Facture facture) {
//        this.facture = facture;
//    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
