package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.DetentionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetentionService {
    private final DetentionRepository detentionRepository;

    @Autowired
    public DetentionService(DetentionRepository detentionRepository) {
        this.detentionRepository = detentionRepository;
    }
}
