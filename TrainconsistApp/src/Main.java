import service.TrainConsistManager;

public class Main {

    public static void main(String[] args) {

        System.out.println("==============================");

        System.out.println("Train Consist Management App");

        System.out.println("==============================");

        TrainConsistManager manager =
                new TrainConsistManager();

        manager.attachBogie("Engine");

        manager.attachBogie("Sleeper");

        manager.attachBogie("Cargo");

        manager.attachBogie("Guard");

        // Duplicate

        manager.attachBogie("Sleeper");

        manager.displayFormation();

    }

}