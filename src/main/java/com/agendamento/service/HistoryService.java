package com.agendamento.service;

import org.springframework.stereotype.Service;

import com.agendamento.repository.HistoryRepository;

@Service
public class HistoryService {

	final HistoryRepository repository;

	public HistoryService(HistoryRepository repository) {
		this.repository = repository;
	}

}
