package pl.pjatk.tdd.strings;

public class StringUtils {
    public static int digitSum (String number) {
        try {
            String[] digits = number.split("");
            int result = 0;

            for (String digit : digits) {
                result += Integer.parseInt(digit);
            }

            return result;
        }
        catch (NumberFormatException e){
            System.out.println("Not a number");
            return 0;
        }
    }

    public static boolean palindromeCheck (String input){
        String reversed = new StringBuffer(input).reverse().toString();
        if (input.equals(reversed)){
            return true;
        }
        else {
            return false;
        }
    }
}
