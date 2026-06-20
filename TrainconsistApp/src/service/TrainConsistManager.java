package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TrainConsistManager {

    // UC2

    private List<String> passengerBogies;

    // UC3

    private Set<String> bogieIds;

    // UC4

    private LinkedList<String> trainConsist;

    public TrainConsistManager() {

        passengerBogies = new ArrayList<>();

        bogieIds = new HashSet<>();

        trainConsist = new LinkedList<>();

    }

    // UC4 Methods

    public void createTrainConsist() {

        trainConsist.add("Engine");

        trainConsist.add("Sleeper");

        trainConsist.add("AC");

        trainConsist.add("Cargo");

        trainConsist.add("Guard");

    }

    public void insertPantryCar() {

        trainConsist.add(2, "Pantry");

    }

    public void removeFirstBogie() {

        trainConsist.removeFirst();

    }

    public void removeLastBogie() {

        trainConsist.removeLast();

    }

    public void displayTrainConsist() {

        System.out.println();

        System.out.println("===== Train Consist =====");

        System.out.println(trainConsist);

    }

}