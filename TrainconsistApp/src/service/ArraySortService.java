package service;

import java.util.Arrays;

public class ArraySortService {

    public void sortBogieNames(
            String[] bogieNames) {

        Arrays.sort(bogieNames);

    }

    public void displayBogieNames(
            String[] bogieNames) {

        System.out.println(
                Arrays.toString(bogieNames));

    }

}