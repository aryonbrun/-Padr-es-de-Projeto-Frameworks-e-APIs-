public class HD {
    private int capacidade;

        public HD(int capacidade) {
        this.capacidade = capacidade;
    }


    public int getCapacidade() {
        return capacidade;
    }

    public String ler(int posicaofinal, int size) {
        System.out.println("le dados do HD");
        return "INFORMAÇÂO LIDA DO HD";
    }

    public void escrever (int posicao,String info){
        System.out.println("escreve dados no HD");
    }
}
