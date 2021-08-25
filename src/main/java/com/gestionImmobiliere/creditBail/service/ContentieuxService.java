package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.domain.Contentieux;
import com.gestionImmobiliere.creditBail.exceptions.ResourceNotFoundException;
import com.gestionImmobiliere.creditBail.repository.ContentieuxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContentieuxService {
    private final ContentieuxRepository contentieuxRepository;

    @Autowired
    public ContentieuxService(ContentieuxRepository contentieuxRepository) {
        this.contentieuxRepository = contentieuxRepository;
    }

    public List<Contentieux> getAllContentieux() {
        return this.contentieuxRepository.findAll();
    }

    public Optional<Contentieux> getOneContentieux(Long id) {
        Optional<Contentieux> contentieux = this.contentieuxRepository.findById(id);
        if (!contentieux.isPresent()) {
            throw new ResourceNotFoundException(String.format("Contentieux with id %s not found!", id));
        }

        return contentieux;
    }

    public Contentieux saveContentieux(Contentieux contentieux) {
        return this.contentieuxRepository.save(contentieux);
    }

    public Contentieux updateContentieux(Contentieux contentieux, Long id) {
        Optional<Contentieux> contentieuxExist = this.contentieuxRepository.findById(id);
        if (!contentieuxExist.isPresent()) {
            throw new ResourceNotFoundException(String.format("Contentieux with id %s not found!", id));
        }

        return this.contentieuxRepository.save(contentieux);
    }

    public void removeContentieux(Long id) {
        Optional<Contentieux> contentieux = this.contentieuxRepository.findById(id);
        if (!contentieux.isPresent()) {
            throw new ResourceNotFoundException(String.format("Contentieux with id %s not found!", id));
        }

        this.contentieuxRepository.delete(contentieux.get());
    }
}
