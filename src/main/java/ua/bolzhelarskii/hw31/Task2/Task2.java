package ua.bolzhelarskii.hw31.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Integer[] numbersArray = new Integer[1000_000];
        Arrays.setAll(numbersArray, i -> i + ThreadLocalRandom.current().nextInt());
        List<Integer> numbersList = Arrays.asList(numbersArray);
        List<Integer> head = numbersList.subList(0, numbersList.size() / 2);
        List<Integer> tail = numbersList.subList(numbersList.size() / 2, numbersList.size());
        ThreadPrimeCounter thread1 = new ThreadPrimeCounter(head);
        ThreadPrimeCounter thread2 = new ThreadPrimeCounter(tail);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.printf("List has %d prime numbers\n", (thread1.getCount() + thread2.getCount()));
    }
}