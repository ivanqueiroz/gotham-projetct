package br.com.vivo.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Entity
@Table(name = "conta")
@EqualsAndHashCode(of = "id")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Integer numero;

	@Column(nullable = false)
	private LocalDate mesReferencia;

	@Column(nullable = false)
	private LocalDateTime periodoInicio;

	@Column(nullable = false)
	private LocalDateTime periodoFim;

	@Column(nullable = false)
	private LocalDateTime dataEmissao;

	@Column(nullable = false)
	private BigDecimal valor;

	@ManyToOne(fetch = FetchType.LAZY)
	private Produto produto;

}
