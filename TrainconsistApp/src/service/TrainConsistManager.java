package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainConsistManager {

    // UC2 - Passenger Bogies

    private List<String> passengerBogies;

    // UC3 - Unique Bogie IDs

    private Set<String> bogieIds;

    public TrainConsistManager() {

        passengerBogies = new ArrayList<>();

        bogieIds = new HashSet<>();

    }

    // UC2 Methods

    public void addPassengerBogie(String bogieType) {

        passengerBogies.add(bogieType);

    }

    public void displayPassengerBogies() {

        System.out.println();

        System.out.println("Passenger Bogies : " + passengerBogies);

    }

    // UC3 Methods

    public void addBogieId(String bogieId) {

        if (bogieIds.add(bogieId)) {

            System.out.println(bogieId + " added successfully.");

        } else {

            System.out.println(bogieId + " already exists.");

        }

    }

    public void displayBogieIds() {

        System.out.println();

        System.out.println("===== Unique Bogie IDs =====");

        System.out.println(bogieIds);

    }

}