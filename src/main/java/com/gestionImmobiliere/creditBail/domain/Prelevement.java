package com.gestionImmobiliere.creditBail.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Prelevement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER)
    private Banque banque;

    private String numeroCompteClient;
    private LocalDate date;
    private int montant;

    public Prelevement() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public String getNumeroCompteClient() {
        return numeroCompteClient;
    }

    public void setNumeroCompteClient(String numeroCompteClient) {
        this.numeroCompteClient = numeroCompteClient;
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
