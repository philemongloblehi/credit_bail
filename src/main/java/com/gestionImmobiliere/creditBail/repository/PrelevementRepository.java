package com.gestionImmobiliere.creditBail.repository;

import com.gestionImmobiliere.creditBail.domain.Prelevement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrelevementRepository extends JpaRepository<Prelevement, Long> {
}
