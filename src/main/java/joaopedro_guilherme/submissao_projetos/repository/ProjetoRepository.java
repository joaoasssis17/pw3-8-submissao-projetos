package joaopedro_guilherme.submissao_projetos.repository;

import joaopedro_guilherme.submissao_projetos.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository  extends JpaRepository<Projeto, Long> {

}
