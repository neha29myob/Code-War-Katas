import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatePhoneNumberTest {

    private CreatePhoneNumberKata createPhoneNumberKata;
    private int[] numbers;

    @Before
    public void setUp(){
        createPhoneNumberKata = new CreatePhoneNumberKata();
        numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    }

    @Test
    public void whenArrayReturnPhoneNumber1(){
        assertEquals("(123) 456-7890",
                createPhoneNumberKata.generatePhoneNumber(numbers));
    }

    @Test
    public void whenArrayReturnPhoneNumber2(){
        assertEquals("(123) 456-7890",
                createPhoneNumberKata.generatePhoneNumberWorking(numbers));
    }

    @Test
    public void whenArrayReturnPhoneNumber3(){
        assertEquals("(123) 456-7890",
                createPhoneNumberKata.generatePhoneNumberBest(numbers));
    }
}
