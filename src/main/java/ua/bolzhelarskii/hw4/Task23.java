package ua.bolzhelarskii.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task23 {
    public static void main(String[] args) {
        int[] input = new int[1000];
        fillArray(input);
        System.out.println(Arrays.toString(input));
        System.out.println("Prime numbers: " + primeCount(input));
        System.out.println("Composite numbers: " + compositeCount(input));
    }

    public static Random fillArray(int[] input) {
        Random random = new Random();
        for (int i = 0; i < input.length; i++) {
            input[i] = random.nextInt(0, 50);
        }
        return random;
    }

    public static int primeCount(int[] input) {
        int count = 0;
        for (int element : input) {
            if (element >= 2 && checkPrime(element)) {
                count++;
            }
        }
        return count;
    }

    public static int compositeCount(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element >= 3 && !checkPrime(element)) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}