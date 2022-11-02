package ua.bolzhelarskii.hw12;

public class Task1 {
    public static void main(String[] args){
        try{
            throw new Exception("Exceptions");
        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            System.out.println("Made sure i was here");
        }
    }
}
