package Exercicio4;

public abstract class Funcionario {
    public String nome;

    public int idade;

    private Formacao formacao;
    private Conjuge conjuge;

    public Funcionario(){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
