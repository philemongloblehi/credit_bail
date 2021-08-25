package com.gestionImmobiliere.creditBail.service;

import com.gestionImmobiliere.creditBail.domain.CategorieMateriel;
import com.gestionImmobiliere.creditBail.exceptions.ResourceNotFoundException;
import com.gestionImmobiliere.creditBail.repository.CategorieMaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieMaterielService {
    private final CategorieMaterielRepository categorieMaterielRepository;

    @Autowired
    public CategorieMaterielService(CategorieMaterielRepository categorieMaterielRepository) {
        this.categorieMaterielRepository = categorieMaterielRepository;
    }

    public List<CategorieMateriel> getAllCategorieMateriels() {
        return this.categorieMaterielRepository.findAll();
    }

    public Optional<CategorieMateriel> getOneCategorieMateriel(Long id) {
        Optional<CategorieMateriel> categorieMateriel = this.categorieMaterielRepository.findById(id);
        if (!categorieMateriel.isPresent()) {
            throw new ResourceNotFoundException(String.format("Categorie materiel with id %s not found!", id));
        }

        return categorieMateriel;
    }

    public CategorieMateriel saveCategorieMateriel(CategorieMateriel categorieMateriel) {
        return this.categorieMaterielRepository.save(categorieMateriel);
    }

    public CategorieMateriel updateCategorieMateriel(CategorieMateriel categorieMateriel, Long id) {
        Optional<CategorieMateriel> categorieMaterielExist = this.categorieMaterielRepository.findById(id);
        if (!categorieMaterielExist.isPresent()) {
            throw new ResourceNotFoundException(String.format("Categorie materiel with id %s not found!", id));
        }

        return this.categorieMaterielRepository.save(categorieMateriel);
    }

    public void removeCategorieMateriel(Long id) {
        Optional<CategorieMateriel> categorieMateriel = this.categorieMaterielRepository.findById(id);
        if (!categorieMateriel.isPresent()) {
            throw new ResourceNotFoundException(String.format("Categorie materiel with id %s not found!", id));
        }

        this.categorieMaterielRepository.delete(categorieMateriel.get());
    }
}
