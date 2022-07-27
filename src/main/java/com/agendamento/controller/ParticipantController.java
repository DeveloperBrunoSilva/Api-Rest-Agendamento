package com.agendamento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendamento.model.Participant;
import com.agendamento.service.ParticipantService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("particpant")
public class ParticipantController {

	final ParticipantService service;

	public ParticipantController(ParticipantService service) {
		this.service = service;
	}

	@GetMapping
	public List<Participant> findAll() {
		return service.findAll();
	}

	@GetMapping("{id}")
	public Optional<Participant> findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping
	public Participant save(@RequestBody Participant participant) {
		return service.save(participant);
	}

	@DeleteMapping("[id]")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
