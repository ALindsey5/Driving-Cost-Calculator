package com.mycompany.drivingcostcalculator;

// Import statement for using the Scanner class
import java.util.Scanner;

public class DrivingCostCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the driving distance
        System.out.print("Enter the driving distance (in miles): ");
        double distance = input.nextDouble();
        
        // Prompt the user for the car's fuel efficiency in miles per gallon
        System.out.print("Enter the fuel efficiency of the car (in miles per gallon): ");
        double mpg = input.nextDouble();
        
        // Prompt the user for the price per gallon of fuel
        System.out.print("Enter the price per gallon (in dollars): ");
        double pricePerGallon = input.nextDouble();
        
        // Calculate the cost of the trip
        double cost = (distance / mpg) * pricePerGallon;
        
        // Display the result
        System.out.printf("The cost of driving is: $%.2f\n", cost);
    }
}
