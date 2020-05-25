package br.com.vivo.dto;

import lombok.Data;

import java.util.List;

@Data
public class ClienteDto {

	private String nome;

	private String cpf;

	private String estado;

	private List<ProdutoDto> produtos;

}
