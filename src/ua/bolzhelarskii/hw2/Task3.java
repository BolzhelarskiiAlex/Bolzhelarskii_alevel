import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("Number " + number + " is " + isEven(number));

    }
    private static boolean isEven(int number) {
        return number %2 == 0;
    }
}
