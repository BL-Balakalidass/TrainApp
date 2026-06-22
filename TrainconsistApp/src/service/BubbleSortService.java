package service;

public class BubbleSortService {

    public void sortCapacities(int[] capacities) {

        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                }

            }

        }

    }

    public void displayCapacities(int[] capacities) {

        for (int capacity : capacities) {

            System.out.print(capacity + " ");

        }

        System.out.println();

    }

}