import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[] randomNum = new int[10];
        fillArray(randomNum);
        System.out.println(Arrays.toString(randomNum));
        int[] array = randomNum;
        System.out.println(Arrays.toString(deleteEven(array)));
    }
    private static void fillArray(int[] randomNum) {
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(10);
        }
    }//     Нахуевертил чтото, что четные на ноли меняет,но кидает их в конец модуля...
    //      так и не получилось исправить
    public static int[] deleteEven(int[] array) {
        int count = 0;
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                temp[count] = array[i];
                count++;

            }
        }
        return temp;
    }
}