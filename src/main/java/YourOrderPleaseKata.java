import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class YourOrderPleaseKata {

    public static void main(String[]args){
        String s = "is2 Thi1s T4est 3a";
        String[] stringArray = (s.split(" "));
        List<String> strgs1 = new ArrayList<>();
        for(int i=1 ;i <= 9 ; i++){
            for(String str: stringArray){
                if(str.contains(String.valueOf(i))){
                    strgs1.add(str);
                }
            }
        }
        // System.out.println(String.join(" ", strgs1));
        order(s);
    }


    public static String order(String s) {

        StringBuilder orderedResult =  new StringBuilder();
        String[] arrNumber = {"1","2","3","4","5","6","7","8","9"};
        String[] testString = s.split(" ");

        for(String number: arrNumber) {
            for (int i = 0; i < testString.length; i++){
                if(testString[i].contains(number)){
                    orderedResult.append(testString[i]+ " ");
                }
            }
        }
        return orderedResult.toString().trim();
        //return(String.join(" ", result));
    }
    public static String orderBest(String words) {
        words = "is2 Thi1s T4est 3a";
        System.out.println(Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get());
       // System.out.println(Arrays.stream(words.split(" ")));

        return "";
    }
}
