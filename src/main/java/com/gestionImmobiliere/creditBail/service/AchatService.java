package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.domain.Achat;
import com.gestionImmobiliere.creditBail.exceptions.ResourceNotFoundException;
import com.gestionImmobiliere.creditBail.repository.AchatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AchatService {
    private final AchatRepository achatRepository;

    @Autowired
    public AchatService(AchatRepository achatRepository) {
        this.achatRepository = achatRepository;
    }

    public List<Achat> getAllAchats() {
        return this.achatRepository.findAll();
    }

    public Optional<Achat> getOneAchat(Long id) {
        Optional<Achat> achat = this.achatRepository.findById(id);
        if (!achat.isPresent()) {
            throw new ResourceNotFoundException(String.format("Achat with id %s not found!", id));
        }

        return achat;
    }

    public Achat saveAchat(Achat achat) {
        return this.achatRepository.save(achat);
    }

    public Achat updateAchat(Achat achat, Long id) {
        Optional<Achat> achatExist = this.achatRepository.findById(id);
        if (!achatExist.isPresent()) {
            throw new ResourceNotFoundException(String.format("Achat with id %s not found!", id));
        }

        return this.achatRepository.save(achat);
    }

    public void removeAchat(Long id) {
        Optional<Achat> achat = this.achatRepository.findById(id);
        if (!achat.isPresent()) {
            throw new ResourceNotFoundException(String.format("Achat with id %s not found!", id));
        }

        this.achatRepository.delete(achat.get());
    }
}
