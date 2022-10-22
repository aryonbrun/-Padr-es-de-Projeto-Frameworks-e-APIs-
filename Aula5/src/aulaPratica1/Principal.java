package aulaPratica1;

public class Principal {
    public static void main(String[] args) {

        PessoaFactory factory = new PessoaFactory();

        String nome, sexo;
        int idade;

        nome = "Carlos";
        sexo = "M";
        idade = 30;
        Pessoa pessoa1 = factory.getPessoaFactory(nome, sexo, idade);
        System.out.println(pessoa1.toString());

        nome = "Maria";
        sexo = "F";
        idade = 23;
        Pessoa pessoa2 = factory.getPessoaFactory(nome, sexo, idade);
        System.out.println(pessoa2.toString());

    }
}
