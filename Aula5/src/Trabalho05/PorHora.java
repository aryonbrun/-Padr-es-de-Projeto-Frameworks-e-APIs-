package Trabalho05;

public class PorHora extends Empregado{
    private float valor_hora;
    private float quant_horas;

    public PorHora(String nome, String email, int anoContratacao, float porHora, float quant_horas){
        super(nome, email, anoContratacao);
        this.valor_hora = porHora;
        this.quant_horas = quant_horas;
    }

    public PorHora(String nome, String email, int anoContracao){
        super(nome, email, anoContracao);
    }

    public float getValor_hora() {
        return valor_hora;
    }
    public void setValor_hora(float valor_hora) {
        this.valor_hora = valor_hora;
    }
    public float getQuant_horas() {
        return quant_horas;
    }
    public void setQuant_horas(float quant_horas) {
        this.quant_horas = quant_horas;
    }

    @Override
    public String toString() {
        return "PorHora{" +
                "porHora=" + valor_hora +
                ", quantHoras=" + quant_horas +
                "} " + super.toString();
    }

    @Override
    public float calculaSalario() {
        return this.getValor_hora() * this.getQuant_horas();
    }


    @Override
    public float ganha() {
        return 0;
    }
}

