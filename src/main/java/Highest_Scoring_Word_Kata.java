
public class Highest_Scoring_Word_Kata {

    public static void main(String[] args){
        //high("man i need a taxi up to ubud");
    }

    public static String high(String s) {
        String result = "";
        int max = 0;
        for(String word: s.split(" ")){
            char[] c = word.toCharArray();
            int sum = 0;
            for (Character cc : c){
                sum+=(cc-'a'+1);
            }
            if (sum > max){
                result = word;
                max = sum;
            }
        }
        return result;
    }

//    public static String highUsingHashMap(String s) {
//        return stream(s.split("\\W+"))
//                .max(comparing(str -> str.chars().sum()))
//                .orElse("");
//    }


}
