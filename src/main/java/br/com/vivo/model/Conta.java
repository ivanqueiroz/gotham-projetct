package br.com.vivo.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "conta")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;

	private Integer numero;

	private LocalDate mesReferencia;

	private LocalDateTime periodoInicio;

	private LocalDateTime periodoFim;

	private LocalDateTime dataEmissao;

	private BigDecimal valor;

	@ManyToOne
	private Produto produto;

}
