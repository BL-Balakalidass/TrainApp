import service.TrainConsistManager;

public class Main {

    public static void main(String[] args) {

        System.out.println("==============================");

        System.out.println("Train Consist Management App");

        System.out.println("==============================");

        TrainConsistManager manager =
                new TrainConsistManager();

        // UC4

        manager.createTrainConsist();

        System.out.println();

        System.out.println("Initial Train:");

        manager.displayTrainConsist();

        manager.insertPantryCar();

        System.out.println();

        System.out.println("After Inserting Pantry:");

        manager.displayTrainConsist();

        manager.removeFirstBogie();

        manager.removeLastBogie();

        System.out.println();

        System.out.println("Final Ordered Train:");

        manager.displayTrainConsist();

    }

}