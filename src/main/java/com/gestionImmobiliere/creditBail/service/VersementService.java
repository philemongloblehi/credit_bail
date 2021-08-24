package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.VersementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VersementService {
    private final VersementRepository versementRepository;

    @Autowired
    public VersementService(VersementRepository versementRepository) {
        this.versementRepository = versementRepository;
    }
}
