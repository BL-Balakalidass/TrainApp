import service.TrainConsistManager;

public class Main {

    public static void main(String[] args) {

        System.out.println("===================================");

        System.out.println(" Train Consist Management App ");

        System.out.println("===================================");

        TrainConsistManager manager =
                new TrainConsistManager();

        // UC2

        manager.addPassengerBogie("Sleeper");

        manager.addPassengerBogie("AC Chair");

        manager.addPassengerBogie("First Class");

        manager.displayPassengerBogies();

        // UC3

        manager.addBogieId("BG101");

        manager.addBogieId("BG102");

        manager.addBogieId("BG103");

        manager.addBogieId("BG101");

        manager.addBogieId("BG102");

        manager.displayBogieIds();

    }

}