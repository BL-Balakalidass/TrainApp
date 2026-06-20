import model.Bogie;
import service.TrainConsistManager;

public class Main {

    public static void main(String[] args) {

        System.out.println("==============================");

        System.out.println("Train Consist Management App");

        System.out.println("==============================");

        TrainConsistManager manager =
                new TrainConsistManager();

        manager.addBogie(

                new Bogie(
                        "Sleeper",
                        "Passenger",
                        72));

        manager.addBogie(

                new Bogie(
                        "AC Chair",
                        "Passenger",
                        56));

        manager.addBogie(

                new Bogie(
                        "First Class",
                        "Passenger",
                        24));

        manager.addBogie(

                new Bogie(
                        "General",
                        "Passenger",
                        90));

        manager.displayBogies();

        int totalSeats =
                manager.calculateTotalCapacity();

        System.out.println();

        System.out.println("===== Total Seating Capacity =====");

        System.out.println("Total Seats : " + totalSeats);

    }

}