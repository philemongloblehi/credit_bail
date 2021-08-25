package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.domain.Commande;
import com.gestionImmobiliere.creditBail.exceptions.ResourceNotFoundException;
import com.gestionImmobiliere.creditBail.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeService {
    private final CommandeRepository commandeRepository;

    @Autowired
    public CommandeService(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    public List<Commande> getAllCommandes() {
        return this.commandeRepository.findAll();
    }

    public Optional<Commande> getOneCommande(Long id) {
        Optional<Commande> commande = this.commandeRepository.findById(id);
        if (!commande.isPresent()) {
            throw new ResourceNotFoundException(String.format("Commande with id %s not found!", id));
        }

        return commande;
    }

    public Commande saveCommande(Commande commande) {
        return this.commandeRepository.save(commande);
    }

    public Commande updateCommande(Commande commande, Long id) {
        Optional<Commande> commandeExist = this.commandeRepository.findById(id);
        if (!commandeExist.isPresent()) {
            throw new ResourceNotFoundException(String.format("Commande with id %s not found!", id));
        }

        return this.commandeRepository.save(commande);
    }

    public void removeCommande(Long id) {
        Optional<Commande> commande = this.commandeRepository.findById(id);
        if (!commande.isPresent()) {
            throw new ResourceNotFoundException(String.format("Commande with id %s not found!", id));
        }

        this.commandeRepository.delete(commande.get());
    }
}
