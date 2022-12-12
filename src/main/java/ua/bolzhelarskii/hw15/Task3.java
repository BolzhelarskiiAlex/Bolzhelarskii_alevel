package ua.bolzhelarskii.hw15;

import java.util.Comparator;
import java.util.TreeSet;

public class Task3 {
    public static class Box {
        private final int capacity;

        public int getCapacity() {
            return capacity;
        }

        public Box(int capacity) {
            this.capacity = capacity;
        }

    }

    static class BoxComparatorFromBigToSmall implements Comparator<Box> {
        public int compare(Box a, Box b) {
            if (b.getCapacity() == 0 || a.getCapacity() == 0) {
                return a.getCapacity() - b.getCapacity();
            }
            return b.getCapacity() - a.getCapacity();
        }
    }

    public static void main(String[] args) {
        Comparator<Box> comparator = new BoxComparatorFromBigToSmall();
        TreeSet<Box> newBox = new TreeSet<>(comparator);
        newBox.add(new Box(3));
        newBox.add(new Box(6));
        newBox.add(new Box(9));
        newBox.add(new Box(2));
        newBox.add(new Box(4));
        newBox.add(new Box(0));
        for (Box capacity : newBox) {
            System.out.println(capacity.getCapacity());
        }

    }
}