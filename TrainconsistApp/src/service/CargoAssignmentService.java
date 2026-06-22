package service;

import exception.CargoSafetyException;
import model.GoodsBogie;

public class CargoAssignmentService {

    public void assignCargo(
            GoodsBogie bogie) {

        try {

            validateCargoAssignment(bogie);

            System.out.println(
                    "Cargo Assigned Successfully : "
                            + bogie);

        } catch (CargoSafetyException e) {

            System.out.println(
                    "Cargo Assignment Failed : "
                            + e.getMessage());

        } finally {

            System.out.println(
                    "Cargo Assignment Log Completed");

        }

    }

    private void validateCargoAssignment(
            GoodsBogie bogie) {

        if (bogie.getBogieType()
                .equalsIgnoreCase("Rectangular")

                &&

                bogie.getCargoType()
                        .equalsIgnoreCase("Petroleum")) {

            throw new CargoSafetyException(
                    "Petroleum cannot be assigned "
                            + "to Rectangular Bogie");

        }

    }

}