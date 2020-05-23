package br.com.vivo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

import br.com.vivo.enums.Formato;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Entity
@Table(name = "registro_cdr")
@EqualsAndHashCode(of = {"id"})
public class RegistroCdr implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "origem", nullable = false)
    private String origem;

    @Column(name = "destino")
    private String destino;

    @Enumerated(EnumType.STRING)
    @Column(name = "formato", nullable = false)
    private Formato formato;

    @Column(name = "data_registro", nullable = false)
    private LocalDateTime dataRegistro;

    @Column(name = "duracao", nullable = false)
    private Integer duracao;

}
