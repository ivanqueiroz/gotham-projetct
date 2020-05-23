package br.com.vivo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Entity
@Table(name = "conta")
@EqualsAndHashCode(of = {"id"})
public class Conta implements Serializable {

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
    @JoinColumn(name="produto_id")
    private Produto produto;

}
