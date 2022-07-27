package com.agendamento.service;

import org.springframework.stereotype.Service;

import com.agendamento.repository.ParticipantRepository;

@Service
public class ParticipantService {

	final ParticipantRepository repository;

	public ParticipantService(ParticipantRepository repository) {
		this.repository = repository;
	}

}
