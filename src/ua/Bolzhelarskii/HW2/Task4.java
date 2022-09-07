public class Task3 {
    public static void main(String[] args) {
        int a = -5;
        int b = 15;
        int c = 8;
        int min;
        min = (a < b) ? a : b;
        min = (min < c) ? min : c;
        System.out.println(min);
    }
}