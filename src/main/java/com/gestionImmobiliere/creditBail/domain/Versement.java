package com.gestionImmobiliere.creditBail.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Versement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private SocieteAcquerante societeAcquerante;

    @ManyToOne(fetch = FetchType.EAGER)
    private Banque banque;

    @ManyToOne(fetch = FetchType.EAGER)
    private Contrat contrat;

    private String numeroCompteSociete;
    private LocalDate date;
    private int montant;

    public Versement() {
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

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public String getNumeroCompteSociete() {
        return numeroCompteSociete;
    }

    public void setNumeroCompteSociete(String numeroCompteSociete) {
        this.numeroCompteSociete = numeroCompteSociete;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
