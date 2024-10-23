package EX04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create arrays for months, cities, and temperatures
        String[] months = {"January", "February", "March", "April"};
        String[] cities = {"City 1", "City 2", "City 3", "City 4"};
        double[][] temperatures = new double[4][4];

        // Input temperatures for each month and city
        for (int i = 0; i < months.length; i++) {
            System.out.println("Enter average temperatures for " + months[i]);
            for (int j = 0; j < cities.length; j++) {
                System.out.print("  " + cities[j] + ": ");
                temperatures[i][j] = scanner.nextDouble();
            }
        }

        // Display the table
        System.out.println("\nAverage Temperatures for Each Month and City:");
        System.out.printf("%-10s", "Month");
        for (int j = 0; j < cities.length; j++) {
            System.out.printf("%-10s", cities[j]);
        }
        System.out.println();
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-10s", months[i]);
            for (int j = 0; j < cities.length; j++) {
                System.out.printf("%-10.2f", temperatures[i][j]);
            }
            System.out.println();
        }

	}

}
