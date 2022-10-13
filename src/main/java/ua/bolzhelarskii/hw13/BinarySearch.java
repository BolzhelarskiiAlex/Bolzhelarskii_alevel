package ua.bolzhelarskii.hw13;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int counter;
        int num;
        int item;
        int[] array;
        int first;
        int last;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of array elements: ");
        num = input.nextInt();
        array = new int[num];
        System.out.println("Enter " + num + " random numbers");
        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();
        Arrays.sort(array);
        System.out.println("Enter number for binary search: ");
        item = input.nextInt();
        first = 0;
        last = num - 1;
        binarySearch(array, first, last, item);
    }

    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;

        position = (first + last) / 2;
        while ((array[position] != item) && (first <= last)) {
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " is a " + ++position + " element of an array");
        } else {
            System.out.println("This number is out of array");
        }
    }

}