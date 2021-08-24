package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.repository.MessageErreurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageErreurService {
    private final MessageErreurRepository messageErreurRepository;

    @Autowired
    public MessageErreurService(MessageErreurRepository messageErreurRepository) {
        this.messageErreurRepository = messageErreurRepository;
    }
}
