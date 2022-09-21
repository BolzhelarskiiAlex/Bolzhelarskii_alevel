import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] randomNum = new int[2000];
        fillArray(randomNum);
        System.out.println(Arrays.toString(randomNum));
        System.out.println(Arrays.toString(copyFullArrayUsingClone(randomNum)));
    }


    private static void fillArray(int[] randomNum) {
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(10) + 1;
        }
    }
    private static int[] copyFullArrayUsingClone(int[] randomNum) {
        for (int i = 0; i < randomNum.length; i++) {
            if (randomNum[i] % 2 == 0){
                randomNum[i] = 0;
            }
        }
        return randomNum.clone();
    }
}
