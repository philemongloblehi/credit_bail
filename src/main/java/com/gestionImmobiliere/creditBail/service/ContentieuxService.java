package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.ContentieuxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentieuxService {
    private final ContentieuxRepository contentieuxRepository;

    @Autowired
    public ContentieuxService(ContentieuxRepository contentieuxRepository) {
        this.contentieuxRepository = contentieuxRepository;
    }
}
