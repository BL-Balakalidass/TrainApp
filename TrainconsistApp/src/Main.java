import service.TrainConsistManager;

public class Main {

    public static void main(String[] args) {

        System.out.println("==============================");

        System.out.println("Train Consist Management App");

        System.out.println("==============================");

        TrainConsistManager manager =
                new TrainConsistManager();

        String trainId = "TRN-1234";

        String cargoCode = "PET-AB";

        System.out.println();

        System.out.println("Train ID : " + trainId);

        if (manager.validateTrainId(trainId)) {

            System.out.println("Train ID is Valid");

        } else {

            System.out.println("Train ID is Invalid");

        }

        System.out.println();

        System.out.println("Cargo Code : " + cargoCode);

        if (manager.validateCargoCode(cargoCode)) {

            System.out.println("Cargo Code is Valid");

        } else {

            System.out.println("Cargo Code is Invalid");

        }

    }

}