package br.com.vivo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "cliente")
@EqualsAndHashCode(of = {"id"})
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Produto> produto;

}
