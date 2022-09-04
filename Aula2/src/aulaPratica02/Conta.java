package aulaPratica02;

public class Conta {
    public int numero;
    public float saldo;

    public Conta(int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
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

    public void creditaSaldo(float valorCreditado) {
        this.saldo = this.saldo + valorCreditado;
    }

    public boolean debitaSaldo(float valorDebitado){

        if(valorDebitado <= this.saldo){
            this.saldo = this.saldo - valorDebitado;
            return true;
        }else{
            return false;
        }
    }
}
