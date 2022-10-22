package aulaPratica;

public class SorveteFactory {
    public static Sorvete get(int tipo) {

        switch (tipo) {
            case 0:
                return new Chocolate();
            case 1:
                return new Baunilha();
            case 2:
                return new Morango();
            default:
                return null;
        }
    }
}
