import service.TrainConsistManager;

public class Main {

    public static void main(String[] args) {

        System.out.println("===============================");

        System.out.println(" Train Consist Management App ");

        System.out.println("===============================");

        TrainConsistManager manager =
                new TrainConsistManager();

        // Add Bogie Capacity Mapping

        manager.addBogieCapacity(
                "Sleeper",
                72);

        manager.addBogieCapacity(
                "AC Chair",
                78);

        manager.addBogieCapacity(
                "First Class",
                24);

        // Display Capacity

        manager.displayCapacityDetails();

    }

}