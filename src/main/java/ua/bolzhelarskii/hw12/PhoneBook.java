package ua.bolzhelarskii.hw12;

import java.util.Optional;
import java.util.Scanner;

public class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";
        System.out.println("Enter a phone number");
        String phone = new Scanner(System.in).nextLine();
        if (findIndexByPhoneNumber(PHONE_BOOK, phone).isPresent()){
            System.out.println("Phone index is " + findIndexByPhoneNumber(PHONE_BOOK, phone).get());
        }else {
            System.out.println("This number is not in the phone book");
        }
    }

    public static Optional<Integer> findIndexByPhoneNumber(String[] PHONE_BOOK, String phoneNumber) {
        if (PHONE_BOOK == null || phoneNumber == null){
            return Optional.empty();
        }
        for (int i = 0; i < PHONE_BOOK.length; i++){
            if (phoneNumber.equals(PHONE_BOOK[i])){
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
