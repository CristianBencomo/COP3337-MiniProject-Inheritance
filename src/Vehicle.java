//package machine;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Date;

public class Vehicle {

    // Class variables
    private static final String CLASSIFICATION = "Vehicle";
    private static final String CODE = "V";
    private static String[] factories = { "MIAMI", "AUSTIN", "LOGAN", "CHARLOTTE" };
    private static int nextID = 5000;
    private static int numberOfVehiclesBuild = 0;

    // instance variables
    protected String id;
    protected String factory;
    private Date buildTime;
    private boolean seeHeader;

    // constructor
    public Vehicle() {

            Random rndGen = new Random();

            int index = rndGen.nextInt(4);

            String letters = factories[index].substring(0,3);
            id = CODE + "-" + letters + "-" + nextID;

            factory = factories[index];
            buildTime = new Date();

            seeHeader = true;

            nextID++;
            numberOfVehiclesBuild++;

        }

    // Class Methods
    public static String getClassification() {
        return CLASSIFICATION;
    }

    public static String[] getFactories() {
        return factories;
    }

    public static int getNumberOfVehiclesBuild() {
        return numberOfVehiclesBuild;
    }

    
    // Instance Methods
    public boolean getSeeHeader() {
        return seeHeader;
    }

    public void setSeeHeader(boolean seeHeader) {
        this.seeHeader = seeHeader;
    }

    public final Date getBuildTime() {
        return buildTime;
    }


    //instance methods that may be overriden or or overload
    private void displayHeader() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("Vehicle Info");
        System.out.println("============================");
    }

    public void displayInfo() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");

        if(seeHeader) {
            displayHeader();
            System.out.println("Classification:\t\t" + CLASSIFICATION);
        }
        
        System.out.println("ID:\t\t\t" + id);
        System.out.println("Factory:\t\t" + factory);
        System.out.println("Build Time\t\t" + dateFormat.format(buildTime));

    }

    public void go() {
        System.out.println("");
        System.out.println("Vehicle's go() executed");
    }

    public void stop() {
        System.out.println("");
        System.out.println("Vehicle's stop() executed");
    }

}