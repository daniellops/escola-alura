package br.com.alura.academico.escola.aplicacao.aluno.matricular;

import br.com.alura.academico.escola.dominio.aluno.Aluno;
import br.com.alura.academico.escola.dominio.aluno.Email;
import br.com.alura.academico.escola.dominio.aluno.CPF;

public class MatricularAlunoDto {
    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new Aluno(
                new CPF(cpfAluno),
                nomeAluno,
                new Email(emailAluno));
    }
}
