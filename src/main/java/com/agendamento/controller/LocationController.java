package com.agendamento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendamento.model.Location;
import com.agendamento.service.LocationService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("location")
public class LocationController {

	final LocationService service;

	public LocationController(LocationService service) {
		this.service = service;
	}

	@GetMapping
	public List<Location> findAll() {
		return service.findAll();
	}

	@GetMapping("{id}")
	public Optional<Location> findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping
	public Location save(@RequestBody Location location) {
		return service.save(location);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);

	}
}
