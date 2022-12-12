package ua.bolzhelarskii.hw10;

@FunctionalInterface
interface Pow {
    double pow(double number, int power);
}

public class Task2 {
    public static void main(String[] args) {
        Pow calc = (num, pow) -> {
            double result = num;
            for (int i = 1; i < pow; i++) {
                result *= num;
            }
            return result;
        };
        System.out.println(calc.pow(5, 3));
    }
}
