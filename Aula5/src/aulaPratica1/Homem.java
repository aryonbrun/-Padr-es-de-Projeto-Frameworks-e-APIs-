package aulaPratica1;

public class Homem extends Pessoa{
    public Homem(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
        System.out.println("Ola Senhor" + this.nome);
    }

    @Override
    public String toString() {
        return "Homem{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
