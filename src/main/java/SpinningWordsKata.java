import java.util.Arrays;

public class SpinningWordsKata {

    public static void main(String[] args){
        String testInput = "Hey fellow warriors";

        spinWordsAlternate(testInput);
        //spinWords(testInput);
    }

    public static String spinWords(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word:words){
            result.append(((word.length() >= 5) ? spin(word) : word) + " ");
        }

        return result.toString().trim();
    }

    private static String spin(String word){
        return new StringBuffer(word).reverse().toString();
    }

    public static String spinWordsAlternate(String sentence){

        String[] words = sentence.split(" ", -1);

        for(int i = 0; i< words.length; i++){
            if(words[i].length() >= 5){
                words[i] = spin(words[i]);
            }
        }
        System.out.println(String.join(" ", words));
        return String.join(" ", words) ;
    }




}
