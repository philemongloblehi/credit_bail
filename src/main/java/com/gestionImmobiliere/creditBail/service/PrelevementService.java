package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.PrelevementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrelevementService {
    private final PrelevementRepository prelevementRepository;

    @Autowired
    public PrelevementService(PrelevementRepository prelevementRepository) {
        this.prelevementRepository = prelevementRepository;
    }
}
