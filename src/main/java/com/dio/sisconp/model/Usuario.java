package com.dio.sisconp.model;

import lombok.Data;

@Data
public class Usuario {
	
	private Long id;
	private CategoriaUsuario categoriaUsuario;
	private String nome;
	private Empresa empresa;
	private NivelAcesso nivelAcesso;
	private JornadaTrabalho jornadaTrabalho;
	
}