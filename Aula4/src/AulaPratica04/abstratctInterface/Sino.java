package AulaPratica04.abstratctInterface;

public class Sino {
    protected String som;
    protected int volume;

    public Sino(){
        this.som = "ding";
        this.volume = 10;
    }
    public void aumentaVolume(){

        System.out.println(" “Aumenta o volume”");
    }
    public void reduzVolume(){
        System.out.println("Reduz o Volume");
    }
}
