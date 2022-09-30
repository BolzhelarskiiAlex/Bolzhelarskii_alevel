import java.util.Arrays;
import java.util.Random;

public class Task23 {
    public static void main(String[] args) {
        int[] randomNum = new int[5];
        fillArray(randomNum);
        System.out.println(Arrays.toString(randomNum));
        System.out.println("Prime num is " + countPrimes(randomNum));
        System.out.println("Composite num is ");
    }

    private static void fillArray(int[] randomNum) {
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(10) + 1;
        }
    }

    public static int[] countPrimes(int[] randomNum) {
        for (int i = 2; i <= randomNum.length; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                int count = i;
                count++;
            }
        }
        return randomNum;
    }
}