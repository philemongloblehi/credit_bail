package com.gestionImmobiliere.creditBail.repository;

import com.gestionImmobiliere.creditBail.domain.CategorieMateriel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieMaterielRepository extends JpaRepository<CategorieMateriel, Long> {
}
