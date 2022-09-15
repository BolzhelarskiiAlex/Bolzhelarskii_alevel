import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int[] randomNum = new int[10];
        fillArray(randomNum);
        System.out.println(Arrays.toString(randomNum));
        System.out.println(getArrayAverage(randomNum));
        System.out.println(Math.sqrt(getArrayAverageGeometrical(randomNum)));

    }

    private static void fillArray(int[] randomNum) {
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(10);
        }
    }

    private static int getArrayAverage(int[] randomNum) {
        int sum = 0;
        int average;
        for (int i = 0; i < randomNum.length; i++) {
            sum = sum + randomNum[i];
        }
        average = sum / randomNum.length;
        return average;
    }

    private static double getArrayAverageGeometrical(int[] randomNum) {
        int geometricAverage = 1;
        for (int i = 0; i < randomNum.length; i++) {
            geometricAverage *= randomNum[i];
        }
        return geometricAverage;
    }
}
