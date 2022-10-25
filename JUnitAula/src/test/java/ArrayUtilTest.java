import org.junit.Test;

import java.awt.image.AreaAveragingScaleFilter;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    @Test
    public void soma() {
        int [] valores = {1,5,10,30};
        assertEquals(46, ArrayUtil.soma(valores));
    }

    @Test
    public void menor() {
        int [] valores = {91,5,123,19};
        assertEquals(5, ArrayUtil.menor(valores));
    }

    @Test
    public void maior() {
        int [] valores = {91,5,123,19};
        assertEquals(123, ArrayUtil.maior(valores));
    }

    @Test
    public void negativo() {
        int [] valoresA = {91,5,123,19};
        assertEquals(0, ArrayUtil.negativo(valoresA));

        int [] valoresB = {10,-5,35,42,54};
        assertEquals(1, ArrayUtil.negativo(valoresB));

        int [] valoresC = {1,4,-78,90,-89,99 };
        assertEquals(2, ArrayUtil.negativo(valoresC));

        int [] valoresD = {-2,-7,-10,-20,-40};
        assertEquals(3, ArrayUtil.negativo(valoresD));


    }

    @Test
    public void par() {
    }

    @Test
    public void busca() {
    }
}