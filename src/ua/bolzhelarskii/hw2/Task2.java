package ua.bolzhelarskii.hw2;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Area of a triangle is " +area());
    }

    private static int area() {
        int x1 = 1;
        int x2 = 3;
        int x3 = 6;
        int y1 = 5;
        int y2 = 5;
        int y3 = 7;
        int S = ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2;
        return S;
    }
}