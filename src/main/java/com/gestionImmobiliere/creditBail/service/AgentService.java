package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.domain.Agent;
import com.gestionImmobiliere.creditBail.exceptions.ResourceNotFoundException;
import com.gestionImmobiliere.creditBail.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentService {
    private final AgentRepository agentRepository;

    @Autowired
    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    public List<Agent> getAllAgents() {
        return this.agentRepository.findAll();
    }

    public Optional<Agent> getOneAgent(Long id) {
        Optional<Agent> agent = this.agentRepository.findById(id);
        if (!agent.isPresent()) {
            throw new ResourceNotFoundException(String.format("Agent with id %s not found!", id));
        }

        return agent;
    }

    public Agent saveAgent(Agent agent) {
        return this.agentRepository.save(agent);
    }

    public Agent updateAgent(Agent agent, Long id) {
        Optional<Agent> agentExist = this.agentRepository.findById(id);
        if (!agentExist.isPresent()) {
            throw new ResourceNotFoundException(String.format("Agent with id %s not found!", id));
        }

        return this.agentRepository.save(agent);
    }

    public void removeAgent(Long id) {
        Optional<Agent> agent = this.agentRepository.findById(id);
        if (!agent.isPresent()) {
            throw new ResourceNotFoundException(String.format("Agent with id %s not found!", id));
        }

        this.agentRepository.delete(agent.get());
    }
}
