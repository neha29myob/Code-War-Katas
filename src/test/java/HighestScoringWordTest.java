import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HighestScoringWordTest {
   @Test
   public void sampleTests() {
       assertEquals("taxi", Highest_Scoring_Word_Kata.high("man i need a taxi"));
       assertEquals("volcano", Highest_Scoring_Word_Kata.high("what time are we climbing up to the volcano"));
       assertEquals("semynak", Highest_Scoring_Word_Kata.high("take me to semynak"));
   }




}
