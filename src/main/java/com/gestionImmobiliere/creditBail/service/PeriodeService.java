package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.PeriodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeriodeService {
    private final PeriodeRepository periodeRepository;

    @Autowired
    public PeriodeService(PeriodeRepository periodeRepository) {
        this.periodeRepository = periodeRepository;
    }
}
