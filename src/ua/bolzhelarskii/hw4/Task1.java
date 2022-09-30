import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] randomNum = new int[10];
        fillArray(randomNum);
        int arr[] = randomNum;
        int n = arr.length;
        System.out.println(Arrays.toString(randomNum));
        System.out.println(getArrayAverage(randomNum));
        System.out.println(getArrayAverageGeometrical(arr, n));

    }

    private static void fillArray(int[] randomNum) {
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(10)+1;
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
    private static double getArrayAverageGeometrical(int arr[], int n) {
        float product = 1;
        for (int i = 0; i < n; i++)
            product = product * arr[i];
        float gm = (float) Math.pow(product, (float) 1 / n);
        return gm;

    }
}