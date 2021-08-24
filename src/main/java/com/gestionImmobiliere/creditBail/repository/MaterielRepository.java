package com.gestionImmobiliere.creditBail.repository;

import com.gestionImmobiliere.creditBail.domain.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Long> {
}
