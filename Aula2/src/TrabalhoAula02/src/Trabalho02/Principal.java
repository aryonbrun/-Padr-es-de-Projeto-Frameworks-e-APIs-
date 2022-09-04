package Trabalho02;

public class Principal {
    public static void main(String[] args) throws Exception {

        Gerente cristianoronaldo = new Gerente("Cristiano Ronaldo", "cristiano_ronaldo@gmail.com", 2006, 100.000f);
        System.out.println(cristianoronaldo);
        System.out.println(String.format("%.2f", cristianoronaldo.calculaSalario()));
        System.out.println(cristianoronaldo.tempoCasa());

        PorComissao kleberson = new PorComissao("Kleberson Pereira ", "klekle@hotmail.com", 2002, 2000.00f, 200f, 3);
        System.out.println(kleberson.toString());
        System.out.println(String.format("%.2f", kleberson.calculaSalario()));
        System.out.println(kleberson.tempoCasa());

        PorHora edilson = new PorHora("Edilson Da Silva Ferreira", "edilson_capetinha@hotmail.com", 1997, 50.00f, 8);
        System.out.println(edilson.toString());
        System.out.println(String.format("%.2f", edilson.calculaSalario()));
        System.out.println(edilson.tempoCasa());

        PorItem neto = new PorItem("Jose Ferreira Neto", "neto10@hotmail.com", 1989,70.000f, 20);
        System.out.println(neto.toString());
        System.out.println(String.format("%.2f", neto.calculaSalario()));
        System.out.println(neto.tempoCasa());
    }
}

