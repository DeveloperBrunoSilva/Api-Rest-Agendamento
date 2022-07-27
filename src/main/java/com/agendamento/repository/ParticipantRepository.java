package com.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agendamento.model.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
