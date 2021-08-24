package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.TypeLitigeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeLitigeService {
    private final TypeLitigeRepository typeLitigeRepository;

    @Autowired
    public TypeLitigeService(TypeLitigeRepository typeLitigeRepository) {
        this.typeLitigeRepository = typeLitigeRepository;
    }
}
