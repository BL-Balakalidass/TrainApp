import java.util.List;

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

        manager.addPassengerBogie(

                new Bogie(
                        "General",
                        90));

        System.out.println();

        System.out.println("All Passenger Bogies");

        manager.displayBogies();

        List<Bogie> filteredBogies =
                manager.filterHighCapacityBogies();

        System.out.println();

        System.out.println("Filtered Bogies (Capacity > 60)");

        for (Bogie bogie : filteredBogies) {

            System.out.println(bogie);

        }

    }

}