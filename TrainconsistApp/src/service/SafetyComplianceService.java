package service;

import model.GoodsBogie;

import java.util.List;

public class SafetyComplianceService {

    public boolean checkSafetyCompliance(
            List<GoodsBogie> goodsBogies) {

        return goodsBogies

                .stream()

                .allMatch(

                        bogie ->

                                !bogie.getBogieType()
                                        .equalsIgnoreCase("Cylindrical")

                                        ||

                                        bogie.getCargoType()
                                                .equalsIgnoreCase("Petroleum")

                );

    }

}