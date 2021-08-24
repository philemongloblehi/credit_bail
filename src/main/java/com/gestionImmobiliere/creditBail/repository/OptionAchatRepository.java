package com.gestionImmobiliere.creditBail.repository;

import com.gestionImmobiliere.creditBail.domain.OptionAchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionAchatRepository extends JpaRepository<OptionAchat, Long> {
}
