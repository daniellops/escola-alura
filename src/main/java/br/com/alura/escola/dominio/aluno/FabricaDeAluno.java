package br.com.alura.escola.dominio.aluno;

public class FabricaDeAluno {
    private Aluno aluno;
    public void comNomeCPFEmail(String nome, String cpf, String email){
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
    }
    public FabricaDeAluno comTelefone(String ddd, String telefone) {
        this.aluno.adicionarTelefone(ddd, telefone);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }
}
