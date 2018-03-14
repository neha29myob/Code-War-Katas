import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YourOrderPleaseTest {
    private YourOrderPleaseKata kata2;
    private String result;

    @Before
    public void setUp(){
        kata2 = new YourOrderPleaseKata();
    }

    @Test
    public void emptyInputReturnsEmptyString(){
         result = kata2.order("");
         assertEquals("", result);
    }


    @Test
    public void WhenDisorderedReturnOrderedString(){
        result = kata2.orderBest("4of Fo1r pe6ople g3ood th5e the2");
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", result);
    }
}
