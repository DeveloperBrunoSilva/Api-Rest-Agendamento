package com.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agendamento.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
