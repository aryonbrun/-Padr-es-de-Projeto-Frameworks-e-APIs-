package aulaPratica02;

public class Poupanca extends Conta{
    public int aniversario;

    public Poupanca(int numero, float saldo, int aniversario) {
        super(numero, saldo);
        this.aniversario = aniversario;
    }

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }


    @Override
    public String toString() {
        return super.toString()+ "Poupança [aniversario=" + aniversario + "]";
    }

}
