package Trabalho01;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        String inserir;

        Scanner input = new Scanner(System.in); //lendo uma entrada no sistema

        // criando a lista

        ArrayList<Cliente> listaCliente = new ArrayList<>();

        System.out.println("voce deseja inserir novos dados? s/n");

        inserir = input.next();

        while(inserir.equals("s")){


            System.out.println("digite o cpf: ");
            String cpf = input.next();

            System.out.println("digite o seu nome: ");
            String nome = input.next();

            System.out.println("digita o email: ");
            String email = input.next();

            System.out.println("digite seu ano de nascimento:");
            Integer anoNascimento = input.nextInt(); input.nextLine();


            System.out.println("voce deseja inserir novos dados? s/n");
            inserir = input.next();

            //instanciando objeto e atributos
            Cliente cliente = new Cliente(cpf, nome, email, anoNascimento);

            // adicinando na posicao 1
            listaCliente.add(cliente); // adicinando na posicao 1
        }

        // variavel guardando inputs

        String cpf = input.nextLine();
        String nome = input.nextLine();
        String email = input.nextLine();
        int anoNascimento = input.nextInt();

        // criando objeto passando variaveis por parametro

        Cliente cliente1 = new Cliente(cpf, nome, email, anoNascimento);

        listaCliente.add(cliente1); // adicinando na posicao 1

        Cliente cliente2 = new Cliente(); //

        System.out.println("digite o cpf: ");
        cpf = input.nextLine();
        System.out.println("digite o seu nome: ");
        nome = input.nextLine();
        System.out.println("digita o email: ");
        email = input.nextLine();
        System.out.println("digite seu ano de nascimento:");
        anoNascimento = input.nextInt();

        // passando as variaveios por parametro para SETTER

        System.out.println("digite o cpf: ");
        cliente2.setCpf(cpf);
        System.out.println("digite o seu nome: ");
        cliente2.setNome(nome);
        System.out.println("digita o email: ");
        cliente2.setEmail(email);
        System.out.println("digite seu ano de nascimento:");
        cliente2.setAnoNascimento(anoNascimento);

        listaCliente.add(cliente2); // adicinando na posicao

        Cliente cliente3 = new Cliente(); //

        System.out.println("digite o cpf: ");
        cliente3.setCpf(input.nextLine());
        System.out.println("digite o seu nome: ");
        cliente3.setNome(input.nextLine());
        System.out.println("digita o email: ");
        cliente3.setEmail(input.nextLine());
        System.out.println("digite seu ano de nascimento:");
        cliente3.setAnoNascimento(input.nextInt());

        listaCliente.add(cliente3); // adicinando na posicao

        //objeto sendo instanciado com atributos

        Cliente cliente4 = new Cliente("08148958274", "jorel",
                "yourexemple@email.com", 1945); //

        //comando para acessar o tribudo

        System.out.println(listaCliente.get(0).getAnoNascimento());

        // (objeto.get(posição).getAtributos)

        // o for vai passar pela lista inteira e a variaval "a" armazena temporariamente cada elemento
        // "a" armazena temporariamente cada objeto percorrido da lista
        for (Cliente a:listaCliente){
            System.out.println(a);
        }

    }

}
