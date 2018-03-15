import java.util.Arrays;
import java.util.stream.IntStream;

public class CreatePhoneNumberKata {

    public static String generatePhoneNumberWorking(int[] numbers) {

        String numberString = Arrays.toString(numbers)
                .replace("[","")
                .replace(", ","")
        .replace("]", "").trim();


        return ("("+ numberString.substring(0,3) + ") "
                + numberString.substring(3,6) + "-"
                + numberString.substring(6,10));
    }

    public static String generatePhoneNumber(int[] numbers) {

        String phoneNumber = "(xxx) xxx-xxxx";
        for (int i: numbers){
            phoneNumber = phoneNumber.replaceFirst("x", String.valueOf(i));
        }
        return phoneNumber;
    }

    public static String generatePhoneNumberBest(int[] numbers) {

        return String.format("(%d%d%d) %d%d%d-%d%d%d%d"
                        , IntStream.of(numbers).boxed().toArray());
    }


}
