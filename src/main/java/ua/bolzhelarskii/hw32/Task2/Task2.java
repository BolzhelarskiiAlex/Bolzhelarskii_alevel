package ua.bolzhelarskii.hw32.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task2 {
    private static int horsePlace;

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horseList = new ArrayList<>();
        int horseCount;
        int horseNumber;
        while (true) {
            System.out.println("Enter non positive number for exit");
            System.out.println("Enter number of horses");
            try {
                horseCount = Integer.parseInt(new Scanner(System.in).next());
                if (horseCount < 1) {
                    break;
                }
                System.out.println("Enter the number of the horse you are betting on");
                horseNumber = Integer.parseInt(new Scanner(System.in).next());
                if (horseNumber < 1) {
                    break;
                }
                if (horseNumber > horseCount) {
                    System.out.println("Error: The horse number must be greater or equals than the number of horses\n");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Value must be an integer number\n");
                continue;
            }
            System.out.println("Start...");
            for (int i = 1; i <= horseCount; i++) {
                Horse horse = new Horse(i);
                horseList.add(horse);
                horse.start();
            }
            for (Horse horse : horseList) {
                horse.join();
            }
            System.out.printf("The horse you are betting on takes %d place\n\n",
                    horseList.get(horseNumber - 1).getPlace());
            horseList.clear();
            horsePlace = 0;
        }
    }

    synchronized public static int incrementAndGetHorsePlace() {
        return ++horsePlace;
    }
}