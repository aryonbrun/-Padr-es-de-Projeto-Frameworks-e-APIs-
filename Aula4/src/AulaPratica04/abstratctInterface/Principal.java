package AulaPratica04.abstratctInterface;

public class Principal {
    public static void main(String[] args) {

    Brasileiro brl = new Brasileiro();
    Americano amc = new Americano();
    Frances fra = new Frances();

    brl.dizOi();
    amc.dizOi();
    fra.dizOi();

    }
}
