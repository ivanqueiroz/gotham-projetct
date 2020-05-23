package br.com.vivo.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Entity
@Table(name = "produto")
@EqualsAndHashCode(of = "id")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String numeroProduto;

	@Column(nullable = false)
	private LocalDateTime dataHabilitacao;

	@Column(nullable = false)
	private String plano;

	@Column(nullable = false)
	private Integer qtdDados;

	@Column(nullable = false)
	private Integer qtdSms;

	@Column(nullable = false)
	private Integer qtdMinutos;

	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;

	@OneToMany(mappedBy = "produto")
	@JoinColumn(name = "produto_id")
	private List<Conta> conta;

}
