//package machine;

public class Car extends Vehicle {

    //Class variables
    private static final String CLASSIFICATION = "Car";
    private static final String CODE = "C";
    
    //refinement instance variables
    protected String color;
    protected String engineType;
    protected double mileage;
    private boolean seeHeader;


    //constructor
    public Car() {
        this("Black", "Gasoline");
    }
    
    public Car(String color, String engineType) {
        super();

        id = CODE + "-" + id;

        this.color = color;
        this.engineType = engineType;
        mileage = 0.0;
        seeHeader = true;

    }


    //instance methods that may be overridden or overload
    private void displayHeader() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("Car Info");
        System.out.println("============================");
    }

    @Override
    public void displayInfo() {

        if(seeHeader) {
            displayHeader();
            System.out.println("Classification:\t\t" + CLASSIFICATION);
        }
        super.setSeeHeader(false);

        super.displayInfo();
        System.out.println("Color\t\t\t" + color);
        System.out.println("Engine Type\t\t" + engineType);

        System.out.printf("Mileage:\t\t%-10.1f\n", mileage);

        if(!(super.getSeeHeader() ) ) {
            super.setSeeHeader(true);
        }
    }

    //overriden method
    public void go() {
        System.out.println("");
        System.out.println("Car's go() executed");
    }
    
    public void setSeeHeader(boolean seeHeader) {
        this.seeHeader = seeHeader;
    }

    //overload method
    public void go(double distance) {

        mileage += distance;

        System.out.println("");
        System.out.println("Car's go(double) executed");
        System.out.println("The car has " + mileage + " miles on it now.");        
    }

    public void stop() {
        System.out.println("");
        System.out.println("Car's stop() executed");
    }

}