package com.dio.sisconp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.sisconp.model.JornadaTrabalho;

@RestController
@RequestMapping("/jornada")
public class JornadaController {
	
	@PostMapping()
	public JornadaTrabalho createJornada() {
		return null;
	}

}