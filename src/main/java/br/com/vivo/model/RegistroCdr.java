package br.com.vivo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.vivo.enums.Formato;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Entity
@Table(name = "registro_cdr")
@EqualsAndHashCode(of = "id")
public class RegistroCdr {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String origem;

	@Column
	private String destino;

	@Column(nullable = false)
	private Formato formato;

	@Column(nullable = false)
	private LocalDateTime dataRegistro;

	@Column(nullable = false)
	private Integer duracao;

}
