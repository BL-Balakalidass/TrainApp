import model.GoodsBogie;
import service.SafetyComplianceService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

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

        SafetyComplianceService service =
                new SafetyComplianceService();

        boolean safe =
                service.checkSafetyCompliance(goodsBogies);

        System.out.println();

        if (safe) {

            System.out.println("Train Safety Status : SAFE");

        } else {

            System.out.println("Train Safety Status : NOT SAFE");

        }

    }

}