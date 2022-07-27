package com.agendamento.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agendamento.model.History;
import com.agendamento.repository.HistoryRepository;

@Service
public class HistoryService {

	final HistoryRepository repository;

	public HistoryService(HistoryRepository repository) {
		this.repository = repository;
	}

	public List<History> findAll() {
		return repository.findAll();
	}

}
