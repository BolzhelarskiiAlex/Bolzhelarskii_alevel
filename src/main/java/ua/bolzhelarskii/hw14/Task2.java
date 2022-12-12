package ua.bolzhelarskii.hw14;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Integer[] myArray1 = new Integer[]{1, 2, 3, 4};
        Double[] myArray2 = new Double[]{1.11, 1.23, 12.34, 567.890};
        Character[] myArray3 = new Character[]{'1', 'a', 'b', 'Z'};
        Utility.printAnyVariable(true);
        Utility.printAnyVariable(0.50);
        Utility.printAnyVariable("true");
        Utility.printAnyVariable('a');
        Utility.printAnyArray(myArray1);
        Utility.printAnyVariable(myArray2);
        Utility.printAnyArray(myArray3);
    }

    public static class Utility {
        public static <T> void printAnyVariable(T anyVariable) {
            System.out.println(anyVariable);
        }

        public static <T> void printAnyArray(T[] array) {
            System.out.println(Arrays.toString(array));
        }
    }
}
