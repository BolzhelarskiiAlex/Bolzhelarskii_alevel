package ua.bolzhelarskii.hw12.Task2;

import java.io.IOException;

public class Task2 {
    public static void main(String[] args){
        f();
    }
    static void g() throws IOException{
        throw new IOException("1 exception g()");
    }
    static void f() {
        try {
            g();
        }catch (IOException exception){
            throw new RuntimeException("2 exception f()");
        }
    }
}
