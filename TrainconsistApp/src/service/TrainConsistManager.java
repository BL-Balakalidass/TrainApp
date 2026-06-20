package service;

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManager {

    // UC5

    private Set<String> trainFormation;

    public TrainConsistManager() {

        trainFormation = new LinkedHashSet<>();

    }

    // Attach Bogie

    public void attachBogie(String bogie) {

        if (trainFormation.add(bogie)) {

            System.out.println(
                    bogie + " attached successfully.");

        } else {

            System.out.println(
                    bogie + " already exists. Duplicate ignored.");

        }

    }

    // Display Formation

    public void displayFormation() {

        System.out.println();

        System.out.println("===== Train Formation =====");

        System.out.println(trainFormation);

    }

}