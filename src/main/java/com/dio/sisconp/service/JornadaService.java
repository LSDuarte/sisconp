package com.dio.sisconp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.sisconp.model.JornadaTrabalho;
import com.dio.sisconp.repository.JornadaRepository;

@Service
public class JornadaService {
	
	@Autowired
	JornadaRepository jornadaRepository;

	public JornadaService(JornadaRepository jornadaRepository) {
		this.jornadaRepository = jornadaRepository;
	}

	public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}

}