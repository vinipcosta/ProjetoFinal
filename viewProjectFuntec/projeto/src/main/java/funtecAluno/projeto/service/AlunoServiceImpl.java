package funtecAluno.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;

import funtecAluno.projeto.model.Aluno;
import funtecAluno.projeto.repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    @Override
	public void insertAluno(Aluno aluno) {
		alunoRepository.save(aluno);
		
	}

    
}
