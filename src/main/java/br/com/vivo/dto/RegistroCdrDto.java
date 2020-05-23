package br.com.vivo.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class RegistroCdrDto {

	private String origem;

	private String destino;

	private Integer formato;

	private LocalDateTime dataRegistro;

	private Integer duracao;

}
