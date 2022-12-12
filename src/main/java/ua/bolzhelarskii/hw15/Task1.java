package ua.bolzhelarskii.hw15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list);

        System.out.println("for each loop: ");
        for (int value : list) {
            System.out.println(value);
        }

        System.out.println("while loop: ");
        int count = 0;
        while (list.size() > count) {
            System.out.println(list.get(count));
            count++;
        }

        System.out.println("iterator: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}