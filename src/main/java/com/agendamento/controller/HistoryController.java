package com.agendamento.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendamento.model.History;
import com.agendamento.service.HistoryService;

@RestController
@RequestMapping("history")
public class HistoryController {

	final HistoryService service;

	public HistoryController(HistoryService service) {
		this.service = service;
	}

	@GetMapping
	public List<History> findAll() {
		return service.findAll();
	}

}
