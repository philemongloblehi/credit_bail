package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterielService {
    private final MaterielRepository materielRepository;

    @Autowired
    public MaterielService(MaterielRepository materielRepository) {
        this.materielRepository = materielRepository;
    }
}
