package pl.pjatk.unit_tests;

public class Calculator {
    public static int power(int a, int b) {
        int result;
        int paw = a;
        while (b > 1) {
            a = a * paw;
            b--;
        }
        result = a;
        return result;
    }
    public static boolean dividable(int a, int b){
        if (b != 0 && a%b == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static int NWD(int first, int second){
        if (first == 0 || second == 0){
            return 0;
        }
        while (first != second){
            if (first > second){
                first = first - second;
            }
            else {
                second = second - first;
            }
        }
        return first;
    }

     public int multiply (int a, int b) throws LargeNumExcept{
        int holder = a;
        int result = 0;
        if (a > 99999 || b > 99999){
            throw new LargeNumExcept("input too large");
        }
        else {
            while (b > 1) {
                a = a + holder;
                result = a;
                b--;
            }

            while (b < -1) {
                a = a + holder;
                result = a;
                b++;
            }

            if (a > 0 && b < 0) {
                result = -result;
            }

            if (a < 0 && b < 0) {
                result = -result;
            }

            return result;
        }
     }
}