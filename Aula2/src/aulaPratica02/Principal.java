package aulaPratica02;

public class Principal {
    public static void main(String[] args) {
        Poupanca poup_01 = new Poupanca(1789, 756.90f, 15);
        Poupanca poup_02 = new Poupanca(0, 0, 0);

        Especial espec_01 = new Especial(3441, 10522.00f, 50000.00f);
        Especial espec_02 = new Especial(0, 0, 0);


        Livro liv = new Livro(2, 35.31f, "Machaddo de assis", "Editora Beta", 315);
        Midia mid = new Midia(3, 9.90f, "Metallica");

        System.out.println(liv.toString());
        System.out.println("Frete" + String.format("%.2f", liv.calculaFrete()));

        System.out.println(liv.toString());
        System.out.println("Frete" + String.format("%.2f", mid.calculaFrete()));
    }


}
