import java.util.Arrays;
import java.util.Random;

public class task34 {
    public static void main(String[] args) {
        int[] randomNum = new int[1000];
        fillArray(randomNum);
        System.out.println(Arrays.toString(randomNum));
        System.out.println("Simple num is ");
        System.out.println("Composite num is ");
    }

    private static void fillArray(int[] randomNum) {
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(10);
        }
    }

    static int countPrimes(int N) {
        if (N < 3)
            return 0;
        int cnt = 1;
        for (int i = 3; i < N; i += 2)
            if (isPrime(i))
                cnt++;
        return cnt;
    }

    static boolean isPrime(int N) {
        for (int i = 2; i * i <= N; i++)
            if (N % i == 0)
                return false;
        return true;
    }
}