package br.com.vivo.dto;

import br.com.vivo.model.Produto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {

	private String nome;

	private String cpf;

	private String estado;

	private Produto produto;

}
