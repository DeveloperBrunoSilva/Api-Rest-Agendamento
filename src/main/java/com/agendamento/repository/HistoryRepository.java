package com.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agendamento.model.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {

}
