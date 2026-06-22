import exception.InvalidCapacityException;
import model.Bogie;
import model.GoodsBogie;
import service.CargoAssignmentService;

import service.PerformanceBenchmarkService;
import service.SafetyComplianceService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        /*
         * UC12
         */

        List<GoodsBogie> goodsBogies =
                new ArrayList<>();

        goodsBogies.add(
                new GoodsBogie(
                        "Rectangular",
                        "Coal"));

        goodsBogies.add(
                new GoodsBogie(
                        "Cylindrical",
                        "Petroleum"));

        goodsBogies.add(
                new GoodsBogie(
                        "Rectangular",
                        "Steel"));

        System.out.println();

        System.out.println("Goods Bogies");

        for (GoodsBogie bogie : goodsBogies) {

            System.out.println(bogie);

        }

        SafetyComplianceService safetyService =
                new SafetyComplianceService();

        boolean safe =
                safetyService.checkSafetyCompliance(
                        goodsBogies);

        System.out.println();

        if (safe) {

            System.out.println(
                    "Train Safety Status : SAFE");

        } else {

            System.out.println(
                    "Train Safety Status : NOT SAFE");

        }

        /*
         * UC13
         */

        List<Bogie> passengerBogies =
                new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {

            try {

                passengerBogies.add(

                        new Bogie(
                                "Bogie-" + i,
                                "Passenger",
                                (i % 100) + 1)

                );

            } catch (InvalidCapacityException e) {

                System.out.println(
                        e.getMessage());

            }

        }

        PerformanceBenchmarkService benchmarkService =
                new PerformanceBenchmarkService();

        benchmarkService.compareLoopVsStream(
                passengerBogies);

        /*
         * UC14
         */

        System.out.println();

        System.out.println(
                "===== UC14 : Capacity Validation =====");

        try {

            Bogie validBogie =

                    new Bogie(
                            "Sleeper",
                            "Passenger",
                            72);

            System.out.println(
                    "Created : "
                            + validBogie);

        } catch (InvalidCapacityException e) {

            System.out.println(
                    e.getMessage());

        }

        try {

            Bogie invalidBogie =

                    new Bogie(
                            "Broken Coach",
                            "Passenger",
                            -10);

            System.out.println(
                    invalidBogie);

        } catch (InvalidCapacityException e) {

            System.out.println(
                    "Exception : "
                            + e.getMessage());

        }



        /*
         * UC15 : Safe Cargo Assignment
         */

        System.out.println();

        System.out.println(
                "===== UC15 : Safe Cargo Assignment =====");

        CargoAssignmentService cargoService =
                new CargoAssignmentService();

        GoodsBogie safeBogie =

                new GoodsBogie(
                        "Cylindrical",
                        "Petroleum");

        cargoService.assignCargo(
                safeBogie);

        System.out.println();

        GoodsBogie unsafeBogie =

                new GoodsBogie(
                        "Rectangular",
                        "Petroleum");

        cargoService.assignCargo(
                unsafeBogie);

        System.out.println();

        System.out.println(
                "Application Continues Successfully...");

    }

}