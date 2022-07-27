package com.agendamento.service;

import org.springframework.stereotype.Service;

import com.agendamento.repository.CommitmentRepository;

@Service
public class CommitmentService {

	final CommitmentRepository repository;

	public CommitmentService(CommitmentRepository repository) {
		this.repository = repository;
	}

}
