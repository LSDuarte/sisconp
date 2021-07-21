package com.dio.sisconp.model;

import lombok.Data;

@Data
public class Empresa {

	private Long id;
	private String descricao;
	private String cnpj;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone;

}