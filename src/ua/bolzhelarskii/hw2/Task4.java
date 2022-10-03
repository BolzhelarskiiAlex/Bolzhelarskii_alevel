package ua.bolzhelarskii.hw2;

public class Task4 {
    public static void main(String[] args) {
        int a = -5;
        int b = 15;
        int c = 8;
        printMinAbsValue(a, b, c);
    }

    private static void printMinAbsValue(int a, int b, int c) {
        int aAbs = a > 0 ? a : -a;
        int bAbs = b > 0 ? b : -b;
        int cAbs = c > 0 ? c : -c;
        int min = Math.min(cAbs, Math.min(aAbs, bAbs));
        min = getNumberFromMinModule(a, b, c, aAbs, bAbs, cAbs, min);
        System.out.printf("Min number is %d", a, b, c, min);
    }

    private static int getNumberFromMinModule(int a, int b, int c, int aAbs, int bAbs, int cAbs, int min) {
        if (min == aAbs) {
            min = a;
        } else if (min == bAbs) {
            min = b;
        } else {
            min = c;
        }
        return min;
    }
}
