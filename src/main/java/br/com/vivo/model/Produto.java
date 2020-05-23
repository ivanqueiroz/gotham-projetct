package br.com.vivo.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Entity
@Table(name = "produto")
@EqualsAndHashCode(of = {"id"})
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_produto", nullable = false, unique = true)
    private String numeroProduto;

    @Column(name = "data_habilitacao", nullable = false)
    private LocalDateTime dataHabilitacao;

    @Column(name = "plano", nullable = false)
    private String plano;

    @Column(name = "qtd_dados", nullable = false)
    private Integer qtdDados;

    @Column(name = "qtd_sms", nullable = false)
    private Integer qtdSms;

    @Column(name = "qtd_minutos", nullable = false)
    private Integer qtdMinutos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<Conta> conta;

}
