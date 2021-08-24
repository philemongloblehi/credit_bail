package com.gestionImmobiliere.creditBail.repository;

import com.gestionImmobiliere.creditBail.domain.SituationMatrimoniale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SituationMatrimonialeRepository extends JpaRepository<SituationMatrimoniale, Long> {
}
