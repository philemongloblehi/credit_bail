package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FournisseurService {
    private final FournisseurRepository fournisseurRepository;

    @Autowired
    public FournisseurService(FournisseurRepository fournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
    }
}
