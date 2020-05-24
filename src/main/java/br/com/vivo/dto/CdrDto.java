package br.com.vivo.dto;

import br.com.vivo.enums.Formato;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CdrDto {

    private String origem;

    private String destino;

    private Formato formato;

    private LocalDateTime dataRegistro;

    private Integer duracao;

}
