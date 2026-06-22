package service;

public class SearchValidationService {

    public void validateSearchData(
            String[] bogieIds) {

        if (bogieIds == null ||
                bogieIds.length == 0) {

            throw new IllegalStateException(
                    "Search cannot be performed. No bogies available.");

        }

    }

}