package TrabalhoAula03;

public class Principal {
    public static void main(String[] args) throws Exception {
        Cliente cliente_01 = new Cliente();

        cliente_01.cpf = "03510400902";
        cliente_01.anoNascimento = 1985;
        cliente_01.nome = "Ana Clara Marques";
        cliente_01.email = "aninha@gmail.com";

        //o erro e retornado por foi mudado pra protectec, nao acessando poq esta em outro pack.

        Conta conta_01 = new Conta();
        conta_01.numero = 1519;
        //conta_01 = 750.95f; //-> Professor teve um erro aquii q nao consegui.
        //diz que tem que mudar a conta pra float, mas ela ja tem na sua classe;
        //quando comento a linha ele deu o erro por conta dos atributos.


        //depois de entrar no packge elas conseguem se comunicar
    }


}
