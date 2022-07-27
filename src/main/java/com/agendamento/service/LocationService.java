package com.agendamento.service;

import org.springframework.stereotype.Service;

import com.agendamento.repository.LocationRepository;

@Service
public class LocationService {

	final LocationRepository repository;

	public LocationService(LocationRepository repository) {
		this.repository = repository;
	}

}
