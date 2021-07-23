package com.dio.sisconp.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.ManyToOne;

import lombok.Data;

@Data
public class Usuario {

	private Long id;
	@ManyToOne
	private CategoriaUsuario categoriaUsuario;
	private String nome;
	@ManyToOne
	private Empresa empresa;
	@ManyToOne
	private NivelAcesso nivelAcesso;
	@ManyToOne
	private JornadaTrabalho jornadaTrabalho;
	private BigDecimal tolerancia;
	private LocalDateTime inicioJornada;
	private LocalDateTime finalJornada;

}