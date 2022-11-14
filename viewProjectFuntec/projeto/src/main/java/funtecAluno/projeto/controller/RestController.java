package funtecAluno.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

import funtecAluno.projeto.model.Aluno;
import funtecAluno.projeto.service.AlunoService;

public class RestController {

    @Autowired
    private AlunoService alunoService;

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void insertAluno(@RequestBody Aluno aluno) {
        alunoService.insertAluno(aluno);
    }
    
}
