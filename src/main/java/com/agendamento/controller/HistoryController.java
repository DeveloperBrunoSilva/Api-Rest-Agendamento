package com.agendamento.controller;

import org.springframework.web.bind.annotation.RestController;

import com.agendamento.service.HistoryService;

@RestController
public class HistoryController {

	final HistoryService service;

	public HistoryController(HistoryService service) {
		this.service = service;
	}

}
