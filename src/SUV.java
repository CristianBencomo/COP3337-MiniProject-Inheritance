//package machine;


public class SUV extends Car {

    //Class variables
    private static final String CLASSIFICATION = "SUV";
    private static final String CODE = "S";
    
    //refinement instance variables
    private boolean hasAllWheelDrive;

    //constructor
    public SUV() {
        super();
        id = CODE + "-" + id;
        hasAllWheelDrive = false;
    }

    public SUV(String color, String engineType, boolean hasAllWheelDrive) {
        super(color, engineType);
        this.hasAllWheelDrive = hasAllWheelDrive;
    }


    //Uses car's stop and go methods

    //instance methods that may be overridden or overload
    private void displayHeader() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("SUV Info");
        System.out.println("============================");
    }

    @Override
    public void displayInfo() {
        
        displayHeader();
        
        super.setSeeHeader(false);

        super.displayInfo();
    
        System.out.println("All-wheel-Drive:\t" + hasAllWheelDrive);

        if(!(super.getSeeHeader() ) ) {
            super.setSeeHeader(true);
        }
    }

    //Instance methods refinement
    public void engageAllWheelDrive() {
        if(hasAllWheelDrive) {
            System.out.println("Engaging All-WheelDrive in the SUV");
        }
        else {
            System.out.println("Sorry All-Wheel-Drive cannot be engaged in the SUV");
        }
    }
}