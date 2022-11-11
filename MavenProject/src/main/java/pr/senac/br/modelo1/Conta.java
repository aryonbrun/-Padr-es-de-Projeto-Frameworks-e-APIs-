package pr.senac.br.modelo1;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;
    private float saldo;

    public Conta(float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
