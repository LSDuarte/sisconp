package com.dio.sisconp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping
	public List<JornadaTrabalho> getJornadaList() {
		return jornadaService.findAll();
	}

	@GetMapping("/{idJornada}")
	public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
		return ResponseEntity
				.ok(jornadaService.getById(idJornada).orElseThrow(() -> new Exception("Jornada não encontrada.")));
	}
}