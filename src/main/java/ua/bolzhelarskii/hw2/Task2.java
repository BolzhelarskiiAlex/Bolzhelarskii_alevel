package ua.bolzhelarskii.hw2;

public class Task2 {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 3;
        int x3 = 6;
        int y1 = 5;
        int y2 = 5;
        int y3 = 7;
        System.out.println("Area of a triangle is " + area(x1, x2, x3, y1, y2, y3));
    }

    private static int area(int x1, int x2, int x3, int y1, int y2, int y3) {
        int S = ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2;
        return S;
    }
}