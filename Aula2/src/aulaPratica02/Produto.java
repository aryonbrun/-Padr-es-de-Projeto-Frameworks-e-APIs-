package aulaPratica02;

public abstract class Produto {
    public int codigo;
    public float preco;

    public Produto(int i, float v) {
    }

    public abstract float calculaFrete();
}
