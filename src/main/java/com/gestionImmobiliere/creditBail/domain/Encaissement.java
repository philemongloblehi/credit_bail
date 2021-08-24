package com.gestionImmobiliere.creditBail.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Encaissement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER)
    private SocieteAcquerante societeAcquerante;

    @ManyToOne(fetch = FetchType.EAGER)
    private Agent agent;

    @ManyToOne(fetch = FetchType.EAGER)
    private Contrat contrat;

    @ManyToOne(fetch = FetchType.EAGER)
    private Encaissement encaissement;

    private LocalDate date;
    private int montant;

    public Encaissement() {
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

    public SocieteAcquerante getSociete() {
        return societeAcquerante;
    }

    public void setSociete(SocieteAcquerante societeAcquerante) {
        this.societeAcquerante = societeAcquerante;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public Encaissement getEncaissement() {
        return encaissement;
    }

    public void setEncaissement(Encaissement encaissement) {
        this.encaissement = encaissement;
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
