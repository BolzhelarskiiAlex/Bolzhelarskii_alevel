package ua.bolzhelarskii.hw18.Task1;

import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        String[] text = "Йогурт 2Pac Кошамба Boss Алкоголь Trinity Харьков Black Тремпель Zero".split(" ");
        Stream.of(text).sorted().forEach(System.out::println);
    }
}