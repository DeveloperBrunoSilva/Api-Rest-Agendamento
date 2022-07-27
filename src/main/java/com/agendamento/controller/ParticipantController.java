package com.agendamento.controller;

import org.springframework.web.bind.annotation.RestController;

import com.agendamento.service.ParticipantService;

@RestController
public class ParticipantController {

	final ParticipantService service;

	public ParticipantController(ParticipantService service) {
		this.service = service;
	}

}
