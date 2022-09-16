import java.util.Scanner;

import static java.lang.Long.reverse;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String str = in.nextLine().replaceAll(" ", "");
        String reversedString = new StringBuffer(str).reverse().toString();
        if (str.equalsIgnoreCase(reversedString)) {
            System.out.println("String " + str + " is palindrome");
        } else {
            System.out.println("String " + str + " is not palindrome");
        }
    }

    private static String removeSpace(String word) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                buffer.append(word.charAt(i));
            }
        }
        return buffer.toString();
    }

    public static String reverseString(String str) {
        String result = " ";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
}