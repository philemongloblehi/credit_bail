package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.PasserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasserService {
    private final PasserRepository passerRepository;

    @Autowired
    public PasserService(PasserRepository passerRepository) {
        this.passerRepository = passerRepository;
    }
}
