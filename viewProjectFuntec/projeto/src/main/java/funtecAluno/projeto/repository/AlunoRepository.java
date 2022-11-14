package funtecAluno.projeto.repository;

import funtecAluno.projeto.model.Aluno;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    

}
