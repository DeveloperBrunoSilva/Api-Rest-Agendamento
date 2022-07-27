package com.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agendamento.model.Commitment;

@Repository
public interface CommitmentRepository extends JpaRepository<Commitment, Long> {

}
