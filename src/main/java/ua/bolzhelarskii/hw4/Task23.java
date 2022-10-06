package ua.bolzhelarskii.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task23 {
    public static void main(String[] args) {
        int[] randomNum = new int[10];
        fillArray(randomNum);
        System.out.println(Arrays.toString(randomNum));
        System.out.println("Prime num is " + (Arrays.toString(countPrimes(randomNum))));
        System.out.println("Composite num is " + (Arrays.toString(countPrimes(randomNum))));
    }
    private static void fillArray(int[] randomNum) {
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(10) + 1;
        }
    }

    public static int[] countPrimes(int[] randomNum) {
        int temp;
        int[] num = randomNum;
        boolean isPrime=true;
        for (int i=2; i<= randomNum.length/2; i++) {
            temp = randomNum.length % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {

        } else {

        }
        return randomNum;
    }
}
