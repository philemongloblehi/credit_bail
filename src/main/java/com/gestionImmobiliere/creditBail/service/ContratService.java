package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.ContentieuxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratService {
    private final ContentieuxRepository contentieuxRepository;

    @Autowired
    public ContratService(ContentieuxRepository contentieuxRepository) {
        this.contentieuxRepository = contentieuxRepository;
    }
}
