package ua.bolzhelarskii.hw16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        addMillionValues(arrayList);
        long endTime = System.currentTimeMillis();
        System.out.println("Array list add time: " + (endTime - startTime) + " ms");
        startTime = System.currentTimeMillis();
        getRandomElement1000000Times(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println("Array list get time: " + (endTime - startTime) + " ms");
        startTime = System.currentTimeMillis();
        addMillionValues(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("Linked list get time: " + (endTime - startTime) + " ms");
        startTime = System.currentTimeMillis();
        getRandomElement1000000Times(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("Linked list get time: " + (endTime - startTime) + " ms");
    }

    private static void addMillionValues(List<Integer> list) {
        for (int i = 1; i <= 1000000; i++) {
            list.add(ThreadLocalRandom.current().nextInt());
        }
    }

    private static void getRandomElement1000000Times(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(ThreadLocalRandom.current().nextInt(list.size()));
        }
    }
}
