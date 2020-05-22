package br.com.vivo.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistroCdrDto {

	private String origem;

	private String destino;

	private Integer formato;

	private LocalDateTime dataRegistro;

	private Integer duracao;

}
