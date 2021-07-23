package com.dio.sisconp.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Calendario {

	private Long id;
	private TipoData tipoData;
	private String descricao;
	private LocalDateTime dataEspecial;

}