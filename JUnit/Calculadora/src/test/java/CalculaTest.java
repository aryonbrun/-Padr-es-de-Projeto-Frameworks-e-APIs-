package src.test.java;

import Calculadora.src.main.java.Calcula;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculaTest {

    @Test
    void soma() {
        Calcula calc = new Calcula();
        assertEquals(15, calc.soma(10, 5), 0);
        assertEquals(8,calc.soma(10, -2),0);
        assertEquals(30,calc.soma(-5, 35),0);
        assertEquals(-40,calc.soma(-5, -35),0);
    }

    // qual a diferença de deixar com ou sem Assertios?
    @Test
    void subtrai() {
        Calcula calc1 = new Calcula();
        assertEquals(5, calc1.subtrai(10,5), 0);
        Assertions.assertEquals(18,calc1.subtrai(13,-5),0);
        Assertions.assertEquals(-6,calc1.subtrai(-1,5),0);
        Assertions.assertEquals(-5,calc1.subtrai(-10,-5),0);
    }

    @Test
    void multiplica() {
        Calcula calc2 = new Calcula();
        assertEquals(4,calc2.multiplica(2,2),0);
        assertEquals(-8,calc2.multiplica(4,-2),0);
        assertEquals(-30,calc2.multiplica(-3,10),0);
        assertEquals(50,calc2.multiplica(-10,-5),0);
    }

    @Test
    void divide() {
        Calcula calc3 = new Calcula();
       assertEquals(1, calc3.divide(2, 2), 0);
       assertEquals(-2, calc3.divide(4, -2), 0);
       assertEquals(-5, calc3.divide(-10, 2), 0);
       assertEquals(10, calc3.divide(-20, -2), 0);
    }

}
