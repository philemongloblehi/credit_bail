package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.SituationMatrimonialeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SituationMatrimonialeService {
    private final SituationMatrimonialeRepository situationMatrimonialeRepository;

    @Autowired
    public SituationMatrimonialeService(SituationMatrimonialeRepository situationMatrimonialeRepository) {
        this.situationMatrimonialeRepository = situationMatrimonialeRepository;
    }
}
