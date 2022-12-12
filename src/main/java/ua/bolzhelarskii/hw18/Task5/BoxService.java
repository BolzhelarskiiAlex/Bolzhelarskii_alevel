package ua.bolzhelarskii.hw18.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BoxService {
    static boolean hasCorrectSize(Box box) {
        int min = ThreadLocalRandom.current().nextInt(1, 500);
        int max = min + ThreadLocalRandom.current().nextInt(500);
        return box.getSize() >= min && box.getSize() <= max;
    }

    static void fillListByRandom(List<Box> boxList, int count) {
        String itemNames = "телефон куртка кот ноутбук телевизор аэрогриль кошелек обогреватель консоль " +
                "бумага койот фильм труселя рюкзак фвтомобиль снег нушники колонка подушка " +
                "пуговица программа крем кпопка жена барашек алкоголь зубы антрисоль пистолет";
        String[] itemNamesArr = itemNames.split(" ");
        for (int i = 0; i < count; i++) {
            List<Item> itemList = new ArrayList<>();
            for (int j = 0; j < ThreadLocalRandom.current().nextInt(itemNames.length()) / 5; j++) {
                itemList.add(new Item(itemNamesArr[ThreadLocalRandom.current().nextInt(itemNamesArr.length)],
                        ThreadLocalRandom.current().nextInt(10000)));
            }
            boxList.add(new Box(itemList, ThreadLocalRandom.current().nextInt(1, 1000)));
        }
    }
}