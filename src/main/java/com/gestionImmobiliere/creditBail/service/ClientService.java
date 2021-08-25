package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.domain.Client;
import com.gestionImmobiliere.creditBail.exceptions.ResourceNotFoundException;
import com.gestionImmobiliere.creditBail.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients() {
        return this.clientRepository.findAll();
    }

    public Optional<Client> getOneClient(Long id) {
        Optional<Client> client = this.clientRepository.findById(id);
        if (!client.isPresent()) {
            throw new ResourceNotFoundException(String.format("Client with id %s not found!", id));
        }

        return client;
    }

    public Client saveClient(Client client) {
        return this.clientRepository.save(client);
    }

    public Client updateClient(Client client, Long id) {
        Optional<Client> clientExist = this.clientRepository.findById(id);
        if (!clientExist.isPresent()) {
            throw new ResourceNotFoundException(String.format("Client with id %s not found!", id));
        }

        return this.clientRepository.save(client);
    }

    public void removeClient(Long id) {
        Optional<Client> client = this.clientRepository.findById(id);
        if (!client.isPresent()) {
            throw new ResourceNotFoundException(String.format("Client with id %s not found!", id));
        }

        this.clientRepository.delete(client.get());
    }
}
