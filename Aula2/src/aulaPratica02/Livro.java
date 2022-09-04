package aulaPratica02;

public class Livro extends Produto{
    public String autor;
    public String editora;
    public int paginas;

    public Livro(int i, float v, String autor, String editora, int paginas) {
        super(i, v);
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", paginas=" + paginas +
                ", codigo=" + codigo +
                ", preco=" + preco +
                '}';
    }


    @Override
    public float calculaFrete() {

        return (float) (this.preco) * 0.05f;
    }
}
