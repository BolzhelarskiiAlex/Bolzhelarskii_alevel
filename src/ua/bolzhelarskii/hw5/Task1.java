package ua.bolzhelarskii.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][3];
        fillArray(numbers);
        System.out.println(Arrays.deepToString(numbers));
    }
    public static void fillArray(int[][] numbers) {
        int counter = 1;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                numbers[i][j] = counter++;
                if (i % 2 != 0) {
                    numbers[i][j] *= -1;
                }
            }
        }
    }
}
