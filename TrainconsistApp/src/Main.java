import model.Bogie;
import service.TrainConsistManager;

public class Main {

    public static void main(String[] args) {

        System.out.println("==============================");

        System.out.println("Train Consist Management App");

        System.out.println("==============================");

        TrainConsistManager manager =
                new TrainConsistManager();

        manager.addPassengerBogie(

                new Bogie(
                        "Sleeper",
                        72));

        manager.addPassengerBogie(

                new Bogie(
                        "AC Chair",
                        56));

        manager.addPassengerBogie(

                new Bogie(
                        "First Class",
                        24));

        System.out.println();

        System.out.println("Before Sorting");

        manager.displayBogies();

        manager.sortByCapacity();

        System.out.println();

        System.out.println("After Sorting");

        manager.displayBogies();

    }

}