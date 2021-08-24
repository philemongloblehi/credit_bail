package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.EncaissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncaissementService {
    private final EncaissementRepository encaissementRepository;

    @Autowired
    public EncaissementService(EncaissementRepository encaissementRepository) {
        this.encaissementRepository = encaissementRepository;
    }
}
