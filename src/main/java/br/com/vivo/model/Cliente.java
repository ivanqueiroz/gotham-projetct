package br.com.vivo.model;

import java.io.Serializable;
import java.util.List;

<<<<<<< HEAD
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
=======
import javax.persistence.*;
>>>>>>> master

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "cliente")
<<<<<<< HEAD
@EqualsAndHashCode(of = { "id" })
public class Cliente implements Serializable {

	private static final long serialVersionUID = 5325666395642081468L;
=======
@EqualsAndHashCode(of = {"id"})
public class Cliente implements Serializable {
>>>>>>> master

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "cpf", nullable = false, unique = true)
	private String cpf;

	@Column(name = "estado")
	private String estado;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Produto> produtos;
=======
    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Produto> produto;
>>>>>>> master

}
