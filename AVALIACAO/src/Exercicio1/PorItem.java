package Exercicio1;

public class PorItem extends Empregado {
    private float valor_producao;
    private float quantidade;

    public PorItem(String nome, String email, int anoContratacao, float valor_producao, int quantidade){
        super(nome, email, anoContratacao);
        this.valor_producao = valor_producao;
        this.quantidade = quantidade;
    }
    public PorItem(String nome, String email, int anoContratacao){
        super(nome, email, anoContratacao);
    }
    public float getValor_producao() {
        return valor_producao;
    }
    public void setValor_producao(float valor_producao) {
        this.valor_producao = valor_producao;
    }
    public float getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return "PorItem{" + "valorProducao=" + valor_producao  + quantidade  + super.toString();
    }

    @Override
    public float calculaSalario() {
        return 0;
    }


    @Override
    public float ganha() {
        return 0;
    }
}
