package br.com.vivo.dto;

import br.com.vivo.model.Produto;
import lombok.Data;

@Data
public class ClienteDto {

	private String nome;

	private String cpf;

	private String estado;

	private Produto produto;

}
