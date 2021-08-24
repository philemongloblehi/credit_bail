package com.gestionImmobiliere.creditBail.repository;

import com.gestionImmobiliere.creditBail.domain.SocieteAcquerante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocieteAcqueranteRepository extends JpaRepository<SocieteAcquerante, Long> {
}
