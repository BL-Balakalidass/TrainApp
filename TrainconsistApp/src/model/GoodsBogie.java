package model;

public class GoodsBogie {

    private String bogieType;
    private String cargoType;

    public GoodsBogie(String bogieType, String cargoType) {

        this.bogieType = bogieType;
        this.cargoType = cargoType;

    }

    public String getBogieType() {

        return bogieType;

    }

    public String getCargoType() {

        return cargoType;

    }

    @Override
    public String toString() {

        return bogieType + " -> " + cargoType;

    }

}