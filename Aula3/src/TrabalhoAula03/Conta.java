package TrabalhoAula03;

public class Conta {
    protected float saldo;
    protected int numero;

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }


}
