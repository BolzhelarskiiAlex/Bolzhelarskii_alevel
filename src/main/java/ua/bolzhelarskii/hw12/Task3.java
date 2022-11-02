package ua.bolzhelarskii.hw12;

import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args){
        try {
            throwException(ThreadLocalRandom.current().nextInt(-1, 2));
        } catch (MyFirstException | MySecondException | MyThirdException exception) {
            exception.printStackTrace();
        }
    }

    static void throwException(int number) throws MyFirstException, MySecondException, MyThirdException {
        if (number == 0) {
            throw new MyFirstException("Number must not be zero");
        }
        if (number > 0) {
            throw new MySecondException("Number must not be greater than zero");
        } else {
            throw new MyThirdException("Number must not be less than zero");
        }

    }
}

class MyFirstException extends Exception {
    public MyFirstException(String message) {
        super(message);
    }
}

class MySecondException extends Exception {
    public MySecondException(String message) {
        super(message);
    }
}

class MyThirdException extends Exception {
    public MyThirdException(String message) {
        super(message);
    }
}
