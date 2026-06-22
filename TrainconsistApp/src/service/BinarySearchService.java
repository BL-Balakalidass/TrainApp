package service;

public class BinarySearchService {

    public boolean searchBogieId(
            String[] bogieIds,
            String searchKey) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison =
                    bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {

                return true;

            } else if (comparison < 0) {

                low = mid + 1;

            } else {

                high = mid - 1;

            }

        }

        return false;

    }

}