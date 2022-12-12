package ua.bolzhelarskii.hw12.Task1;


public class Task1 {
    public static void main(String[] args){
        try{
            throw new MyException("Exceptions");
        }catch (MyException exception){
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("Made sure i was here");
        }
    }
}
