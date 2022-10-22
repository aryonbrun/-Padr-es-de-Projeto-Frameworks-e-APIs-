package aulaPratica1;

public class PessoaFactory{

    public static Pessoa getPessoaFactory(String sexo, String nome, int idade){
        if (sexo == "M"){
            return new Homem(nome,idade);
        } else if (sexo == "F") {
            return new Mulher(nome, idade);
        } else {
            return null;
        }

    }


}
