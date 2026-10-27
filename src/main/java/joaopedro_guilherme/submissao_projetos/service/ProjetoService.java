package joaopedro_guilherme.submissao_projetos.service;

import joaopedro_guilherme.submissao_projetos.entity.Projeto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class ProjetoService {

    public BigDecimal media(BigDecimal notaInovacao, BigDecimal notaApresentacao, BigDecimal mediaFinal){
        BigDecimal soma = notaInovacao.add(notaApresentacao);
        mediaFinal = soma.divide(BigDecimal.valueOf(2), 2, RoundingMode.HALF_UP);
        return mediaFinal;

    }

    /*Regra de Negócio: Ao enviar as notas, o backend calcula a mediaFinal e atualiza automaticamente
     o status para APROVADO (se mediaFinal >= 7.0) ou REVISAR.*/
}
