package com.dio.sisconp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import lombok.Data;

@Data
public class Movimentacao {

	// chave composta em spring
	@Embeddable
	@Data
	public class MovimentacaoId implements Serializable {
		private static final long serialVersionUID = 1L;
		private Long idMovimento;
		private Long idUsuario;
	}

	// id composto da classe acima.
	@EmbeddedId
	private MovimentacaoId id;
	private LocalDateTime dataEntrada;
	private LocalDateTime dataSaida;
	private BigDecimal periodo;
	private Ocorrencia ocorrencia;
	private Calendario calendario;
}