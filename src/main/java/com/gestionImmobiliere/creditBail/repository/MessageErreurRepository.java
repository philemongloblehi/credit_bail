package com.gestionImmobiliere.creditBail.repository;

import com.gestionImmobiliere.creditBail.domain.MessageErreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageErreurRepository extends JpaRepository<MessageErreur, Long> {
}
