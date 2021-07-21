package com.dio.sisconp.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Usuario {

	private Long id;
	private CategoriaUsuario categoriaUsuario;
	private String nome;
	private Empresa empresa;
	private NivelAcesso nivelAcesso;
	private JornadaTrabalho jornadaTrabalho;
	private BigDecimal tolerancia;
	private LocalDateTime inicioJornada;
	private LocalDateTime finalJornada;

}