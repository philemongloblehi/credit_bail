package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.SocieteAcqueranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocieteAcqueranteService {
    private final SocieteAcqueranteRepository societeAcqueranteRepository;

    @Autowired
    public SocieteAcqueranteService(SocieteAcqueranteRepository societeAcqueranteRepository) {
        this.societeAcqueranteRepository = societeAcqueranteRepository;
    }
}
