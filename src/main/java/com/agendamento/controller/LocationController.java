package com.agendamento.controller;

import org.springframework.web.bind.annotation.RestController;

import com.agendamento.service.LocationService;

@RestController
public class LocationController {

	final LocationService service;

	public LocationController(LocationService service) {
		this.service = service;
	}

}
