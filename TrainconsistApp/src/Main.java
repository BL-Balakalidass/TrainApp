import exception.InvalidCapacityException;
import model.Bogie;
import model.GoodsBogie;
import service.CargoAssignmentService;
import service.BubbleSortService;
import service.ArraySortService;
import service.LinearSearchService;
import service.SearchValidationService;

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





        /*
         * UC16 : Bubble Sort
         */

        System.out.println();

        System.out.println(
                "===== UC16 : Sort Passenger Capacities =====");

        int[] capacities =
                {72, 56, 18, 120, 80, 40};

        BubbleSortService bubbleSortService =
                new BubbleSortService();

        System.out.println();

        System.out.println(
                "Before Sorting :");

        bubbleSortService.displayCapacities(
                capacities);

        bubbleSortService.sortCapacities(
                capacities);

        System.out.println();

        System.out.println(
                "After Sorting :");

        bubbleSortService.displayCapacities(
                capacities);


        /*
         * UC17 : Arrays.sort()
         */

        System.out.println();

        System.out.println(
                "===== UC17 : Sort Bogie Names =====");

        String[] bogieNames = {

                "Sleeper",
                "First Class",
                "AC Chair",
                "Cargo",
                "Guard"

        };

        ArraySortService arraySortService =
                new ArraySortService();

        System.out.println();

        System.out.println(
                "Before Sorting :");

        arraySortService.displayBogieNames(
                bogieNames);

        arraySortService.sortBogieNames(
                bogieNames);

        System.out.println();

        System.out.println(
                "After Sorting :");

        arraySortService.displayBogieNames(
                bogieNames);


        /*
         * UC18 : Linear Search
         */

        System.out.println();

        System.out.println(
                "===== UC18 : Linear Search for Bogie ID =====");

        String[] bogieIds = {

                "BG101",
                "BG205",
                "BG110",
                "BG320",
                "BG450"

        };

        String searchKey = "BG320";

        LinearSearchService linearSearchService =
                new LinearSearchService();

        boolean found =
                linearSearchService.searchBogieId(
                        bogieIds,
                        searchKey);

        System.out.println();

        System.out.println(
                "Searching for Bogie ID : "
                        + searchKey);

        if (found) {

            System.out.println(
                    "Bogie Found");

        } else {

            System.out.println(
                    "Bogie Not Found");

        }



        /*
         * UC20 : Exception Handling During Search Operations
         */

        System.out.println();

        System.out.println(
                "===== UC20 : Exception Handling During Search =====");

        String[] emptyBogieIds = {};

        SearchValidationService validationService =
                new SearchValidationService();

        try {

            validationService.validateSearchData(
                    emptyBogieIds);

            System.out.println(
                    "Search can proceed.");

        } catch (IllegalStateException e) {

            System.out.println(
                    "Error : " + e.getMessage());

        }

    }



}