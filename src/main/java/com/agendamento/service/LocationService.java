package com.agendamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.agendamento.model.Location;
import com.agendamento.repository.LocationRepository;

@Service
public class LocationService {

	final LocationRepository repository;

	public LocationService(LocationRepository repository) {
		this.repository = repository;
	}

	public List<Location> findAll() {
		return repository.findAll();
	}

	public Optional<Location> findById(Long id) {
		return repository.findById(id);
	}

	public Location save(Location location) {
		return repository.save(location);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
