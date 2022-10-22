package aulaPratica;

public class Principal {
    public static void main(String[] args) {

        Sorvete sorv1 = SorveteFactory.get(0); //pede apenas um paramentro
        System.out.println(sorv1.fazerSorvete());

        Sorvete sorv2 = SorveteFactory.get(1); //pede apenas um paramentro
        System.out.println(sorv2.fazerSorvete());

        Sorvete sorv3 = SorveteFactory.get(2); //pede apenas um paramentro
        System.out.println(sorv3.fazerSorvete());
    }
}
