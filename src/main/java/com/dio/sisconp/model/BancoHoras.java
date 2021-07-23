package com.dio.sisconp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import lombok.Data;

@Data
public class BancoHoras {

	@Data
	@Embeddable
	public class BancoHorasId implements Serializable {
		private static final long serialVersionUID = 1L;
		private Long idBancoHoras;
		private Long idMovimentacao;
		private Long idUsuario;
	}

	@EmbeddedId
	private BancoHorasId id;
	private LocalDateTime dataTrabalhada;
	private BigDecimal qtdHoras;
	private BigDecimal saldo;

}