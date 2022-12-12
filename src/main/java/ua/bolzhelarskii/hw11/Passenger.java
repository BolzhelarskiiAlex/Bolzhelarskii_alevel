package ua.bolzhelarskii.hw11;

public class Passenger {
    private final String name;

    public Passenger ( String name ) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Passenger{" +
                "name='" + name + '\'' +
                '}';
    }
}