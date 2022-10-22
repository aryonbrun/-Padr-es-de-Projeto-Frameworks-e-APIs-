import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayUtilTest {

    @Test
    void soma() {
        int [] valores = {1,5,10,30};
        Assertions.assertEquals(46, ArrayUtil.soma(valores));

    }




}