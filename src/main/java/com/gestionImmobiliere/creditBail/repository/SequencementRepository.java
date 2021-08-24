package com.gestionImmobiliere.creditBail.repository;

import com.gestionImmobiliere.creditBail.domain.Sequencement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SequencementRepository extends JpaRepository<Sequencement, Long> {
}
