package br.com.vivo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Entity
@Table(name = "conta")
@EqualsAndHashCode(of = { "id" })
public class Conta implements Serializable {

	private static final long serialVersionUID = 3197769213606321084L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "numero", nullable = false)
	private Integer numero;

	@Column(name = "mes_referencia", nullable = false)
	private LocalDate mesReferencia;

	@Column(name = "periodo_inicio", nullable = false)
	private LocalDateTime periodoInicio;

	@Column(name = "periodo_fim", nullable = false)
	private LocalDateTime periodoFim;

	@Column(name = "data_emissao", nullable = false)
	private LocalDateTime dataEmissao;

	@Column(name = "valor", nullable = false)
	private BigDecimal valor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "produto_id")
	private Produto produto;

}
