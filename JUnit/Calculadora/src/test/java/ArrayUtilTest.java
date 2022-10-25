package src.main.java.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayUtilTest {



    //alterando de ArrayUtil para ArrayUtilTest

    // Alterando soma de (void soma) para (static void soma) PQ?
    // Todas as operações abaixo estao requisitando mudar pra static.
    @Test
    static int soma(int[] valores) {        // <- add int[] como 1 paramentro do metodo
                                            // Alterando todos de void pra int
        valores = new int[]{1, 5, 10, 30};  // Mudando a forma do Int
        Assertions.assertEquals(46, ArrayUtilTest.soma(valores)); //alterando de ArrayUtil para ArrayUtilTes
        return 0;
    }

    @Test
    static int menor(int[] valores) {
        valores = new int [] {91,5,123,19};
        Assertions.assertEquals(5,ArrayUtilTest.menor(valores));
        return 0;
    }

    @Test
    static int maior(int[] valores) {
        valores = new int []  {91,5,123,19};
        Assertions.assertEquals(123, ArrayUtilTest.maior(valores));
        return 0;
    }

    @Test
    static int negativo(int[] valoresA) {
        valoresA = new int[]{91, 5, 123, 19};
        Assertions.assertEquals(0, ArrayUtilTest.negativo(valoresA));

        int [] valoresB = {10,-5,35,42,54};
        Assertions.assertEquals(1, ArrayUtilTest.negativo(valoresB));

        int [] valoresC = {1,4,-78,90,-89,99};
        Assertions.assertEquals(2, ArrayUtilTest.negativo(valoresC));

        int [] valoresD = {-2,-7,-10,-20,-40};
        Assertions.assertEquals(5, ArrayUtilTest.negativo(valoresD));
        return 0;
    }

    // Adicionando Assertions, pq?
    @Test
    static Object par(int[] valoresA) {
        valoresA = new int[]{2, 4, 6, 8};
        Assertions.assertTrue((Boolean) ArrayUtilTest.par(valoresA));

        int [] valoresB = {10,15,20,42,54};
        Assertions.assertFalse((Boolean) ArrayUtilTest.par(valoresB));

        int [] valoresC = {1,3,5};
        Assertions.assertFalse((Boolean) ArrayUtilTest.par(valoresA));

        return null;
    }

    //Pq Acrescentar o Assertations?
    @Test
    static int busca(int[] valoresA, int i) {
        valoresA = new int [] {2,4,6,8};
        Assertions.assertEquals(3, ArrayUtilTest.busca(valoresA, 8));
        Assertions.assertEquals(-1, ArrayUtilTest.busca(valoresA, 5));

        int [] valoresB = {10,15,20,42,54};
        Assertions.assertEquals(0, ArrayUtilTest.busca(valoresB, 10));
        Assertions.assertEquals(-1, ArrayUtilTest.busca(valoresB, 25));

        int [] valoresC = {1,-3,5};
        Assertions.assertEquals(-1, ArrayUtilTest.busca(valoresC, 8));
        Assertions.assertEquals(0, ArrayUtilTest.busca(valoresC, 1));
        return i;
    }
}