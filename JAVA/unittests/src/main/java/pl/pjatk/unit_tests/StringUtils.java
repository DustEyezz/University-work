package pl.pjatk.unit_tests;

public class StringUtils {
    public static String toUpperCase (String a){
        return a.toUpperCase();
    }

    public static String reverseString (String a){
        StringBuilder input = new StringBuilder();
        input.append(a);
        input.reverse();

        return input.toString();
    }

    public static String multiplyString (String a, int b){
        String holder = a;
        while (b>1){
            a = a + holder;
            b--;
        }
        return a;
    }

    public static String removeSmallChars (String a){
        a = a.replaceAll("[a-z]", "");
        return a;
    }

    public static String removeBigChars (String a){
        a = a.replaceAll("[A-Z]", "");
        return a;
    }

    public static String removeAllButLetters (String a){
        a = a.replaceAll("[^a-zA-Z]", "");
        return a;
    }
}
