package ua.bolzhelarskii.hw18.Task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Box> boxList = new ArrayList<>();
        BoxService.fillListByRandom(boxList, 10);
        boxList.stream()
                .filter(BoxService::hasCorrectSize)
                .map(Box::getItem)
                .flatMap(Collection::stream)
                .sorted(Comparator.comparing(Item::getCost))
                .forEach(System.out::println);
    }
}