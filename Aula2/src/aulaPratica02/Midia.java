package aulaPratica02;

public class Midia extends Produto{
    public String artista;

    public Midia(int i, float v, String artista) {
        super(i, v);
        this.artista = artista;
    }


    @Override
    public String toString() {
        return "Midia{" +
                "artista='" + artista + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                '}';
    }

    @Override
    public float calculaFrete() {

        return (float) (this.preco) * 0.05f;
    }
}
