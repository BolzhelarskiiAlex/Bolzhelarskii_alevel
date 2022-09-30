import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};
        fillArray(numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Is array is going down? " +isGrow(numbers));
    }
    public static void fillArray(int lenght){
        int[] numbers = new int[lenght];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);

        }
    }
    public static boolean isGrow(int[] numbers){
        for (int i = 1; i < numbers.length - 1; i++){
            if (numbers[i] > numbers[i - 1]){
                return false;
            }
        }
        return true;
    }
}
