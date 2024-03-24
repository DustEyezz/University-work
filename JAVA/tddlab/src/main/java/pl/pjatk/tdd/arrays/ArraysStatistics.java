package pl.pjatk.tdd.arrays;

public class ArraysStatistics {
    public static int max(int[] numbers){
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max) {
                    max = numbers[i];
            }
        }
        return max;
    }

    public static int min(int[] numbers){
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static double avg(int[] numbers){
        double result = 0;
        for (int number:numbers) {
            result = result + number;
        }
        result = result / numbers.length;

        return result;
    }

    public static int sum(int[] numbers){
        int result = 0;

        for (int number: numbers) {
            result+=number;
        }

        return result;
    }
}
