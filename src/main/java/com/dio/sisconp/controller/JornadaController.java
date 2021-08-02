package com.dio.sisconp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.sisconp.model.JornadaTrabalho;
import com.dio.sisconp.service.JornadaService;

@RestController
@RequestMapping("/jornada")
public class JornadaController {

	@Autowired
	JornadaService jornadaService;

	@PostMapping
	public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
		return jornadaService.saveJornada(jornadaTrabalho);
	}

}