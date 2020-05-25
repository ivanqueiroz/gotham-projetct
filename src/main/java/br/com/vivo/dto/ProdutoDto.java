package br.com.vivo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProdutoDto {

    private String numeroProduto;

    private LocalDateTime dataHabilitacao;

    private String plano;

    private Integer qtdDados;

    private Integer qtdSms;

    private Integer qtdMinutos;
    
    private ClienteDto cliente;

}
