package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.LitigeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LitigeService {
    private final LitigeRepository litigeRepository;

    @Autowired
    public LitigeService(LitigeRepository litigeRepository) {
        this.litigeRepository = litigeRepository;
    }
}
