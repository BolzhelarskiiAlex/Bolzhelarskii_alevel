package ua.bolzhelarskii.hw11;

public class Main {
    public static void main ( String[] args ) {
        Passenger[] passengers = new Passenger[4];
        Object[] seats = new Object[3];

        passengers[0] = new Passenger ( "Peter" );
        passengers[1] = new Passenger ( "Lucy" );
        passengers[2] = new Passenger ( "Alex" );
        passengers[3] = new Passenger ( "Dashiki" );

        PassengerCar passengerCar = new PassengerCar ( "Audi" , 2015 , "red" ,
                50 , 25 , 8, seats );

        passengerCar.showStat ( );
        passengerCar.getPassengerOnSeats (passengers );
        passengerCar.showStat ();
        passengerCar.move ();
        passengerCar.showStat ( );


        Truck truck = new Truck ( "Man" , 2017 , "white" ,
                250 , 5 , 25 , 75 );

        truck.showStat ( );
        truck.cargoCheck ( );
        truck.move ();
        truck.refuel ( );
        truck.showStat ( );
        truck.move ();
        truck.showStat ();
    }
}