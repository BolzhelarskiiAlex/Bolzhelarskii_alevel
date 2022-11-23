package ua.bolzhelarskii.hw18.Task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] strings = "Йогурт 2Pac Кошамба Boss Алкоголь Trinity Харьков Black Тремпель Zero".split(" ");
        printSortArray(strings);
    }

    public static void printSortArray(String[] strings) {
        Arrays.stream(strings)
                .sorted()
                .forEach(System.out::println);
    }
}