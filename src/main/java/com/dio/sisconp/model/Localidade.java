package com.dio.sisconp.model;

import javax.persistence.OneToMany;

import lombok.Data;

@Data
public class Localidade {

	private Long id;
	@OneToMany
	private NivelAcesso nivelAcesso;
	private String descricao;
}