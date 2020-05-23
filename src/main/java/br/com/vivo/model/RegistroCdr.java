package br.com.vivo.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.vivo.enums.Formato;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "registro_cdr")
@EqualsAndHashCode(of = "id")
public class RegistroCdr {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String origem;

	private String destino;

	private Formato formato;

	private LocalDateTime dataRegistro;

	private Integer duracao;

}
