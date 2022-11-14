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
@Table(name = "tb_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_aluno;

    private String nome;
    private String rg;
    private String cpf;
    private String dt_nascimento;
    private String telefone;
    private String endereco;
    private String email;
    private String nome_pai;
    private String nome_mae;
    private String senha;

	@ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
    
}
