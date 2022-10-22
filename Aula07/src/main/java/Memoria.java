public class Memoria {

    private int tamanho;
    private int ocupada;

    public Memoria(int tamanho, int ocupada) {
        this.tamanho = tamanho;
        this.ocupada = ocupada;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getOcupara() {
        return ocupada;
    }

    public void carregar(int position, String info){
        System.out.println("carrega dados na memoria");
        this.ocupada = this.ocupada + info.length();
    }

    public void liberar(int position, String info){
        System.out.println("libera dados da memoria");
        this.ocupada = this.ocupada - info.length();
    }

    public String ler(int position, int tamanha){
        return "DADOS LIDOS DA MEMORIA";
    }

}
