package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManager {

    // Train ID Pattern
    private static final Pattern TRAIN_PATTERN =
            Pattern.compile("TRN-\\d{4}");

    // Cargo Code Pattern
    private static final Pattern CARGO_PATTERN =
            Pattern.compile("PET-[A-Z]{2}");

    // Validate Train ID

    public boolean validateTrainId(String trainId) {

        Matcher matcher =
                TRAIN_PATTERN.matcher(trainId);

        return matcher.matches();

    }

    // Validate Cargo Code

    public boolean validateCargoCode(String cargoCode) {

        Matcher matcher =
                CARGO_PATTERN.matcher(cargoCode);

        return matcher.matches();

    }

}