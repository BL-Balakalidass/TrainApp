package service;

import java.util.ArrayList;
import java.util.List;

import model.Bogie;

public class TrainConsistManager {

    // Dynamic Train Consist

    private List<Bogie> consist;

    public TrainConsistManager() {

        consist = new ArrayList<>();

    }

    public List<Bogie> getConsist() {

        return consist;

    }

    public void displayConsistSummary() {

        System.out.println();

        System.out.println("===== Train Consist Summary =====");

        System.out.println("Total Bogies : " + consist.size());

    }

}