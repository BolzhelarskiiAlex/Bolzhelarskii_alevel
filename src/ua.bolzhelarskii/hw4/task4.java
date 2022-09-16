import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[] randomNum = new int[2000];
        fillArray(randomNum);
        System.out.println(Arrays.toString(randomNum));
        System.out.println(Arrays.toString(change()));

    }

    private static void fillArray(int[] randomNum) {
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(10);
        }
    }
    private static void change(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                mas[i] = 0;
            }
        }return;
    }
}