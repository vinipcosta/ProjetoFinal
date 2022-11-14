package funtecAluno.projeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter @Setter @NoArgsConstructor @AllArgsConstructor 
@Table(name = "tb_professor")
public class Professor {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_professor;
    
    private int matricula;
    private String nome;
    private String senha;
    private String cpf;
    private String email;
    private long telefone;
    private int fg_ativo;
    
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

}