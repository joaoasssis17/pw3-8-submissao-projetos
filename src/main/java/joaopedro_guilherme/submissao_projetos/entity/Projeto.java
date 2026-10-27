package joaopedro_guilherme.submissao_projetos.entity;

import jakarta.persistence.*;
import joaopedro_guilherme.submissao_projetos.enums.TipoStatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_projeto")
    private Long id;

    @Column(name = "tx_titulo")
    private String titulo;

    @Column(name = "nr_notaInovacao")
    private BigDecimal notaInovacao;

    @Column(name = "nr_notaApresentacao")
    private BigDecimal notaApresentacao;

    @Column(name = "nr_mediaFinal")
    private BigDecimal mediaFinal;

    @Column(name = "tp_Status")
    @Enumerated(EnumType.STRING)
    private TipoStatusEnum status;

}
