package com.dio.sisconp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.sisconp.model.JornadaTrabalho;
import com.dio.sisconp.repository.JornadaRepository;

@Service
public class JornadaService {

	JornadaRepository jornadaRepository;

	@Autowired
	public JornadaService(JornadaRepository jornadaRepository) {
		this.jornadaRepository = jornadaRepository;
	}

	public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}

	public List<JornadaTrabalho> findAll() {
		return jornadaRepository.findAll();
	}

	public Optional<JornadaTrabalho> getById(Long idJornada) {
		return jornadaRepository.findById(idJornada);
	}

}