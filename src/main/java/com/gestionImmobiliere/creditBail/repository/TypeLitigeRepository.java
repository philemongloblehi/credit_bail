package com.gestionImmobiliere.creditBail.repository;

import com.gestionImmobiliere.creditBail.domain.TypeLitige;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeLitigeRepository extends JpaRepository<TypeLitige, Long> {
}
