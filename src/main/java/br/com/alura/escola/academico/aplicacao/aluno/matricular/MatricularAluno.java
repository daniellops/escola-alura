package br.com.alura.academico.escola.aplicacao.aluno.matricular;

import br.com.alura.academico.escola.dominio.aluno.Aluno;
import br.com.alura.academico.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    // COMMAND
    public void executa(MatricularAlunoDto dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }
}
