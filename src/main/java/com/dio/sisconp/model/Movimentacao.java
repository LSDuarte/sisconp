package com.dio.sisconp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
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
	@Id
	@EmbeddedId
	private MovimentacaoId id;
	private LocalDateTime dataEntrada;
	private LocalDateTime dataSaida;
	private BigDecimal periodo;
	@ManyToOne
	private Ocorrencia ocorrencia;
	@ManyToOne
	private Calendario calendario;
}