package com.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Commitment extends JpaRepository<Commitment, Long> {

}
