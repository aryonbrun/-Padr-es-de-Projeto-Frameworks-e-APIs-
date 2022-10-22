public class CPU {
    private double clock;

    private int status;

    public CPU(double v, int i) { //metodos criado atraves do erro do publicComputadoFacade
    }

    public void inicia() {
        System.out.println("inicialização inicial da CPU");
        this.status = 1;
    }

    public void execute() {
        System.out.println("execute algo no processador");
        this.status = 2;
    }

    public void carrega() {
        if (this.status !=2) {
            this.status =2;
        }
        System.out.println("carrega registrador");
    }

    public void libera() {
        System.out.println("libera registradores");
        this.status =3;
    }

    public void desliga() {
        System.out.println("desliga da CPU");
        this.status = 4;
    }
}
