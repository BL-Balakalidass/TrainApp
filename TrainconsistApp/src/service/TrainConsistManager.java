package service;

import model.Bogie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainConsistManager {

    private List<Bogie> bogieList;

    public TrainConsistManager() {

        bogieList = new ArrayList<>();

    }

    // Add Bogie

    public void addBogie(Bogie bogie) {

        bogieList.add(bogie);

    }

    // Display All Bogies

    public void displayBogies() {

        System.out.println();

        System.out.println("===== All Bogies =====");

        for (Bogie bogie : bogieList) {

            System.out.println(bogie);

        }

    }

    // UC9 : Group by Type

    public Map<String, List<Bogie>> groupBogiesByType() {

        return bogieList

                .stream()

                .collect(

                        Collectors.groupingBy(

                                Bogie::getType

                        )

                );

    }

}