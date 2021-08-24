package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.CategorieMaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieMaterielService {
    private final CategorieMaterielRepository categorieMaterielRepository;

    @Autowired
    public CategorieMaterielService(CategorieMaterielRepository categorieMaterielRepository) {
        this.categorieMaterielRepository = categorieMaterielRepository;
    }
}
