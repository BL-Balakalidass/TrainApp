package service;

public class LinearSearchService {

    public boolean searchBogieId(
            String[] bogieIds,
            String searchKey) {

        for (String bogieId : bogieIds) {

            if (bogieId.equals(searchKey)) {

                return true;

            }

        }

        return false;

    }

}