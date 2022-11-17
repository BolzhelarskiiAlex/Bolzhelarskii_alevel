package ua.bolzhelarskii.hw18.Task4;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = Stream.generate(() -> new Random().nextInt(200) - 100)
                .limit(10).toList();
        System.out.println("min value = " + list.stream().reduce(Integer.MAX_VALUE, Integer::min));
    }
}