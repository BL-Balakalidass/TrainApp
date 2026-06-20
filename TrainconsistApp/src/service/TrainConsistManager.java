package service;

import model.Bogie;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManager {

    private List<Bogie> bogieList;

    public TrainConsistManager() {

        bogieList = new ArrayList<>();

    }

    // Add Bogie

    public void addBogie(Bogie bogie) {

        bogieList.add(bogie);

    }

    // Display Bogies

    public void displayBogies() {

        System.out.println();

        System.out.println("===== Train Bogies =====");

        for (Bogie bogie : bogieList) {

            System.out.println(bogie);

        }

    }

    // UC10 : Total Seat Count

    public int calculateTotalCapacity() {

        return bogieList

                .stream()

                .map(Bogie::getCapacity)

                .reduce(0, Integer::sum);

    }

}