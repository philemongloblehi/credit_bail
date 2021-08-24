package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.FonctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FonctionService {
    private final FonctionRepository fonctionRepository;

    @Autowired
    public FonctionService(FonctionRepository fonctionRepository) {
        this.fonctionRepository = fonctionRepository;
    }
}
