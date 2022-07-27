package com.agendamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.agendamento.model.Participant;
import com.agendamento.repository.ParticipantRepository;

@Service
public class ParticipantService {

	final ParticipantRepository repository;

	public ParticipantService(ParticipantRepository repository) {
		this.repository = repository;
	}

	public List<Participant> findAll() {
		return repository.findAll();
	}

	public Optional<Participant> findById(Long id) {
		return repository.findById(id);
	}

	public Participant save(Participant participant) {
		return repository.save(participant);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}
