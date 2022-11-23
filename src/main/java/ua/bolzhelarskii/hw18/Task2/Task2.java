package ua.bolzhelarskii.hw18.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task2 {
    public static void printNumberStatistic(List<Integer> list) {
        IntSummaryStatistics statistics = list.stream()
                .filter(x -> x >= 0)
                .mapToInt(x -> x)
                .summaryStatistics();
        System.out.println(statistics);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5, 2, 1, 9, 7, 10, 3, 9, 25,
                1, 6, 8, 4, -13, -60, -13, -1, 20, -36, -123);
        printNumberStatistic(numbers);
    }
}
