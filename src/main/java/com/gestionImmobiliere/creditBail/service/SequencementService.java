package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.SequencementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SequencementService {
    private final SequencementRepository sequencementRepository;

    @Autowired
    public SequencementService(SequencementRepository sequencementRepository) {
        this.sequencementRepository = sequencementRepository;
    }
}
