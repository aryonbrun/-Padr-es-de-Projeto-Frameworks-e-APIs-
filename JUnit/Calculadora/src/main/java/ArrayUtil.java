import static sun.nio.cs.Surrogate.MAX;
import static sun.nio.cs.Surrogate.MIN;

public class ArrayUtil {

    public static int soma (int vetor[]){

        int resultado = 0;

        for (int i = 0; i < vetor.length; i++){
            resultado = resultado + vetor[i];
        }
        return resultado;

    }

    public static void menor (int vetor){
        int resultado = MIN;

    }

    public static void maior(int vetor){
        int resultado = MAX;
    }
}
