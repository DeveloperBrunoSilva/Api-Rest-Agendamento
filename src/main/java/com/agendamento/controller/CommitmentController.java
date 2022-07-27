package com.agendamento.controller;

import org.springframework.web.bind.annotation.RestController;

import com.agendamento.service.CommitmentService;

@RestController
public class CommitmentController {

	final CommitmentService service;

	public CommitmentController(CommitmentService service) {
		this.service = service;
	}

}
