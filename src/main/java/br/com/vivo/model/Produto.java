package br.com.vivo.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produto")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;

	private String numeroProduto;

	private LocalDateTime dataHabilitacao;

	private String plano;

	private Integer qtdDados;

	private Integer qtdSms;

	private Integer qtdMinutos;

	@ManyToOne
	private Cliente cliente;

	@OneToMany(mappedBy = "produto")
	@JoinColumn(name = "produto_id")
	private List<Conta> conta;

}
