package com.dio.sisconp.model;

import javax.persistence.ManyToOne;

import lombok.Data;

@Data
public class Localidade {

	private Long id;
	@ManyToOne
	private NivelAcesso nivelAcesso;
	private String descricao;
}