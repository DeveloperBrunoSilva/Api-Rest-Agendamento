package com.agendamento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendamento.model.Commitment;
import com.agendamento.service.CommitmentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("commitment")
public class CommitmentController {

	final CommitmentService service;

	public CommitmentController(CommitmentService service) {
		this.service = service;
	}

	@GetMapping
	public List<Commitment> findAll() {
		return service.findAll();
	}

	@GetMapping("{id}")
	public Optional<Commitment> findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping
	public Commitment save(@RequestBody Commitment commitment) {
		return service.save(commitment);
	}

	@DeleteMapping("[id]")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	

}
