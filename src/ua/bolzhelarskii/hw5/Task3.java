import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(rotateArray(array)));

    }

    private static int[][] rotateArray(int[][] array) {
        int[][] board = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                board[j][i] = array[i][j];
            }
        }

        return board;
    }
}