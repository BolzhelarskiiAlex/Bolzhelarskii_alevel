import java.util.Scanner;
public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = -5;
        int b = 15;
        int c = 8;
        System.out.print(a);
        a = sc.nextInt();
        System.out.println(b);
        b = sc.nextInt();
        System.out.println(c);
        c = sc.nextInt();
        if ((Math.abs(a)) < (Math.abs(b)) && (Math.abs(a)) < (Math.abs(c))) {
            System.out.println(Math.abs(a));
        } else if ((Math.abs(b)) < (Math.abs(a)) && (Math.abs(b)) < (Math.abs(c))) {
            System.out.println(Math.abs(a));
        } else {
            System.out.println(Math.abs(b));
        }
    }
}
