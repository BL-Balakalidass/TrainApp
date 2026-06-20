package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Bogie;

public class TrainConsistManager {

    private List<Bogie> passengerBogies;

    public TrainConsistManager() {

        passengerBogies = new ArrayList<>();

    }

    // Add Bogie

    public void addPassengerBogie(Bogie bogie) {

        passengerBogies.add(bogie);

    }

    // Sort by Capacity

    public void sortByCapacity() {

        passengerBogies.sort(

                Comparator.comparingInt(

                        Bogie::getCapacity

                )

        );

    }

    // Display Bogies

    public void displayBogies() {

        System.out.println();

        System.out.println("===== Passenger Bogies =====");

        for (Bogie bogie : passengerBogies) {

            System.out.println(bogie);

        }

    }

}