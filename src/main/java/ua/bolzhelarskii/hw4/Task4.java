package ua.bolzhelarskii.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] randomNum = new int[2000];
        fillArray(randomNum);
        System.out.println(Arrays.toString(randomNum));
        System.out.println(Arrays.toString(arrayCopy(randomNum)));
        System.out.println(Arrays.toString(copyFullArrayUsingClone(randomNum)));

    }


    private static void fillArray(int[] randomNum) {
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(10) + 1;
        }
    }

    public static int[] arrayCopy(int[] initialArray) {

        return Arrays.copyOf(initialArray, initialArray.length);
    }

    public static int[] copyFullArrayUsingClone(int[] array) {
        int[] arrayEvenToZero = Arrays.copyOf(array, array.length);
        for (int i = 0; i < arrayEvenToZero.length; i++) {
            if (arrayEvenToZero[i] % 2 == 0) {
                arrayEvenToZero[i] = 0;
            }
        }
        return arrayEvenToZero;
    }

}
