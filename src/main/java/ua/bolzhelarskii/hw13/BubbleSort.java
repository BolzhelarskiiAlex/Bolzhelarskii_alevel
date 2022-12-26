package ua.bolzhelarskii.hw13;

import java.util.Arrays;
import java.util.Random;
//реалізувати сортування пухирцем / бульбашкою
public class BubbleSort {
    public static void main(String[] args) {
        int[] randomNum = new int[10];
        fillArray(randomNum);
        int[] sorted = arrayCopy(randomNum);
        sort(sorted);
        System.out.println(Arrays.toString(randomNum));
        System.out.println(Arrays.toString(sorted));

    }

    public static void fillArray(int[] randomNum) {
        Random random = new Random();
        int i;
        for (i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(10) + 1;
        }
    }

    public static void sort(int[] array) {
        boolean isChanged;
        int changeAmount = 0;
        do {
            isChanged = false;
            for (int i = 0; i < array.length - 1 - changeAmount; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isChanged = true;
                }
            }
            changeAmount++;
        } while (isChanged);
    }

    public static int[] arrayCopy(int[] initialArray) {
        return Arrays.copyOf(initialArray, initialArray.length);
    }
}
