package com.agendamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.agendamento.model.Commitment;
import com.agendamento.repository.CommitmentRepository;

@Service
public class CommitmentService {

	final CommitmentRepository repository;

	public CommitmentService(CommitmentRepository repository) {
		this.repository = repository;
	}

	public List<Commitment> findAll() {
		return repository.findAll();

	}

	public Optional<Commitment> findById(Long id) {
		return repository.findById(id);
	}
	
	public Commitment save(Commitment commitment) {
		return repository.save(commitment);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
