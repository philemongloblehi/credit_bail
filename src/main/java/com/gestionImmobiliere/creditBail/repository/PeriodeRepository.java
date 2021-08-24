package com.gestionImmobiliere.creditBail.repository;

import com.gestionImmobiliere.creditBail.domain.Periode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodeRepository extends JpaRepository<Periode, Long> {
}
