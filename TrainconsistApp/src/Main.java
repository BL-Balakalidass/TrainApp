import model.Bogie;
import service.TrainConsistManager;

import java.util.List;
import java.util.Map;

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
                        "Cargo Box",
                        "Goods",
                        100));

        manager.addBogie(

                new Bogie(
                        "Oil Tank",
                        "Goods",
                        150));

        manager.displayBogies();

        Map<String, List<Bogie>> groupedBogies =
                manager.groupBogiesByType();

        System.out.println();

        System.out.println("===== Grouped Bogies =====");

        for (Map.Entry<String, List<Bogie>> entry :
                groupedBogies.entrySet()) {

            System.out.println();

            System.out.println(entry.getKey());

            for (Bogie bogie : entry.getValue()) {

                System.out.println("   " + bogie);

            }

        }

    }

}