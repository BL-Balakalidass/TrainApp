package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Bogie;

public class TrainConsistManager {

    private List<Bogie> passengerBogies;

    public TrainConsistManager() {

        passengerBogies = new ArrayList<>();

    }

    // Add Passenger Bogie

    public void addPassengerBogie(Bogie bogie) {

        passengerBogies.add(bogie);

    }

    // Sort by Capacity (UC7)

    public void sortByCapacity() {

        passengerBogies.sort(

                Comparator.comparingInt(

                        Bogie::getCapacity));

    }

    // Display All Bogies

    public void displayBogies() {

        System.out.println();

        System.out.println("===== Passenger Bogies =====");

        for (Bogie bogie : passengerBogies) {

            System.out.println(bogie);

        }

    }

    // UC8 : Filter Capacity > 60

    public List<Bogie> filterHighCapacityBogies() {

        return passengerBogies

                .stream()

                .filter(

                        bogie -> bogie.getCapacity() > 60

                )

                .collect(Collectors.toList());

    }

}