package service;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManager {

    private List<String> passengerBogies;

    public TrainConsistManager() {

        passengerBogies = new ArrayList<>();

    }

    // Add Passenger Bogie

    public void addPassengerBogie(String bogieType) {

        passengerBogies.add(bogieType);

        System.out.println(
                bogieType + " added successfully.");

    }

    // Remove Passenger Bogie

    public void removePassengerBogie(String bogieType) {

        if (passengerBogies.remove(bogieType)) {

            System.out.println(
                    bogieType + " removed successfully.");

        } else {

            System.out.println(
                    bogieType + " not found.");

        }

    }

    // Check Existence

    public void checkPassengerBogie(String bogieType) {

        if (passengerBogies.contains(bogieType)) {

            System.out.println(
                    bogieType + " exists in the consist.");

        } else {

            System.out.println(
                    bogieType + " does not exist.");

        }

    }

    // Display Passenger Bogies

    public void displayPassengerBogies() {

        System.out.println();

        System.out.println("===== Passenger Bogies =====");

        System.out.println(passengerBogies);

    }

}