package br.com.alura.academico.escola.aplicacao.indicacao;

import br.com.alura.academico.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno indicado);
}
