package funtecAluno.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;

import funtecAluno.projeto.model.Aluno;
import funtecAluno.projeto.repository.AlunoRepository;

@Controller
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;

    // Acessa o formulario
    @GetMapping("/form")
    public String alunoForm(Aluno aluno) {

        return "formulario";
    }

    // Adiciona novo funcionario
    @PostMapping("/add")
    public String novo(@Valid Aluno aluno, BindingResult result) {

        if (result.hasFieldErrors()) {
            return "redirect:/form";
        }

        alunoRepository.save(aluno);

        return "redirect:/index";
    }
    
    @GetMapping("/index")
    public String paginaInicial(){
        
        return "/index";
    }




}
