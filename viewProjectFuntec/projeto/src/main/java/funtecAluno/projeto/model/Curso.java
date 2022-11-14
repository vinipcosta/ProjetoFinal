package funtecAluno.projeto.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter @Setter @NoArgsConstructor @AllArgsConstructor 
@Table(name = "tb_curso")
public class Curso {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_curso;
    
    private String nome;
    private int duracao_horas;
    private int fg_ativo;
	
    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunos = new ArrayList<>();
    
    @OneToMany(mappedBy = "curso")
    private List<Professor> professores = new ArrayList<>();
    
}