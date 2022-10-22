package aulaPratica1;

public class Mulher extends Pessoa{
    public Mulher(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("ola senhora" + this.nome);
    }

    @Override
    public String toString() {
        return "Mulher{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
