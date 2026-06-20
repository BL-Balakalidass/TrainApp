package service;

import java.util.HashMap;
import java.util.Map;

public class TrainConsistManager {

    // UC6 : Bogie -> Capacity Mapping

    private Map<String, Integer> bogieCapacityMap;

    public TrainConsistManager() {

        bogieCapacityMap = new HashMap<>();

    }

    // Add Bogie Capacity

    public void addBogieCapacity(String bogieName,
                                 int capacity) {

        bogieCapacityMap.put(bogieName, capacity);

        System.out.println(
                bogieName +
                        " capacity added successfully.");

    }

    // Display Capacity Details

    public void displayCapacityDetails() {

        System.out.println();

        System.out.println("===== Bogie Capacity Details =====");

        for (Map.Entry<String, Integer> entry :
                bogieCapacityMap.entrySet()) {

            System.out.println(
                    "Bogie : " +
                            entry.getKey() +
                            " | Capacity : " +
                            entry.getValue());

        }

    }

}