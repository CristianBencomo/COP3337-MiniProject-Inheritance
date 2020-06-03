//package app;

/*
import Car; //import machine.Car;
import Motorcycle; //import machine.Motorcycle;
import SUV; //import machine.SUV;
import Vehicle; //import machine.Vehicle;
*/

public class Controller {

    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle();

        vehicle.displayInfo();

        Car car1 = new Car("Blue", "Diesel");
        Car car2 = new Car();

        car1.displayInfo();
        car2.displayInfo();

        ((Vehicle)car2).displayInfo(); // wouldnt this display Vehicle info instead?

        car2.go(172.3);
        car2.displayInfo();


        SUV suv = new SUV();

        suv.displayInfo();
        ((Car)suv).displayInfo();
        ((Vehicle)suv).displayInfo();
        
        
        System.out.println("\n\nSUV calling go methods");
        System.out.println("============================");
        suv.go();
        suv.go(2503.2);
        System.out.println("");


        Motorcycle motorcycle = new Motorcycle("Black");
        motorcycle.go();
        motorcycle.displayInfo();

        Vehicle car3 = new Car("Red", "Electric");

        car3.go();

        ((Car)car3).go(30.3);

        car3.displayInfo();
    }
    
}