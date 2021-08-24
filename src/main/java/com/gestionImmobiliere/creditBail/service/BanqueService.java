package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.domain.Banque;
import com.gestionImmobiliere.creditBail.exceptions.ResourceNotFoundException;
import com.gestionImmobiliere.creditBail.repository.BanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BanqueService {
    private final BanqueRepository banqueRepository;

    @Autowired
    public BanqueService(BanqueRepository banqueRepository) {
        this.banqueRepository = banqueRepository;
    }

    public List<Banque> getAllBanques() {
        return this.banqueRepository.findAll();
    }

    public Optional<Banque> getOneBanque(Long id) {
        Optional<Banque> banque = this.banqueRepository.findById(id);
        if (!banque.isPresent()) {
            throw new ResourceNotFoundException(String.format("Banque with id %s not found!", id));
        }

        return banque;
    }

    public Banque saveBanque(Banque banque) {
        return this.banqueRepository.save(banque);
    }

    public Banque updateBanque(Banque banque, Long id) {
        Optional<Banque> banqueExist = this.banqueRepository.findById(id);
        if (!banqueExist.isPresent()) {
            throw new ResourceNotFoundException(String.format("Banque with id %s not found!", id));
        }

        return this.banqueRepository.save(banque);
    }

    public void removeBanque(Long id) {
        Optional<Banque> banque = this.banqueRepository.findById(id);
        if (!banque.isPresent()) {
            throw new ResourceNotFoundException(String.format("Banque with id %s not found!", id));
        }

        this.banqueRepository.delete(banque.get());
    }
}
