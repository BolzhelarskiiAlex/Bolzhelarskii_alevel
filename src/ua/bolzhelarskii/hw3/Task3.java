package ua.bolzhelarskii.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words");
        String str = sc.nextLine();
        System.out.println("Word count is " + count(str));
    }

    public static int count(String str) {
        int count = 0;
        if(str.length() != 0){
            count++;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' '){
                    count++;
                }
            }
        }
        return count;
    }
}