package funtecAluno.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import funtecAluno.projeto.model.Aluno;
import funtecAluno.projeto.service.AlunoService;

@Controller
public class SpringController {
    
    @Autowired
    private AlunoService alunoService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "produtos", new Aluno());
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("produtos")Aluno aluno, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        alunoService.insertAluno(aluno);
 
        return "redirect:";
    }

}




