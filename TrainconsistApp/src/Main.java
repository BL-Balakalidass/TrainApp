import service.TrainConsistManager;

public class Main {

    public static void main(String[] args) {

        System.out.println("===================================");

        System.out.println(" Train Consist Management App ");

        System.out.println("===================================");

        TrainConsistManager manager =
                new TrainConsistManager();

        // Add Passenger Bogies

        manager.addPassengerBogie("Sleeper");

        manager.addPassengerBogie("AC Chair");

        manager.addPassengerBogie("First Class");

        // Display List

        manager.displayPassengerBogies();

        // Remove AC Chair

        manager.removePassengerBogie("AC Chair");

        // Check Sleeper

        manager.checkPassengerBogie("Sleeper");

        // Final List

        manager.displayPassengerBogies();

    }

}