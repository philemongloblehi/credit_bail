package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.OptionAchatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionAchatService {
    private final OptionAchatRepository optionAchatRepository;

    @Autowired
    public OptionAchatService(OptionAchatRepository optionAchatRepository) {
        this.optionAchatRepository = optionAchatRepository;
    }
}
