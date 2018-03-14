import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinningWordsTest {

    private SpinningWordsKata spinningWordsKata;
    private String result;

    @Before
    public void setUp(){
        spinningWordsKata = new SpinningWordsKata();
    }

    @Test
    public void whenStringReturnArray(){

        //String[] words = spinningWordsKata.spinWords("Hey wollef sroirraw");
        //Assert.assertArrayEquals(new String[]{"Hey", "wollef", "sroirraw"}, words );
    }

    @Test
    public void test() {
        assertEquals("emocleW", spinningWordsKata.spinWordsAlternate("Welcome"));
        assertEquals("Hey wollef sroirraw", spinningWordsKata.spinWordsAlternate("Hey fellow warriors"));
    }

}
