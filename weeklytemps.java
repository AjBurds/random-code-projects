// Intialize ArrayLists to store the days of the week and their cooresponding average temps.
import java.util.ArrayList;
import java.util.Scanner;

public class weeklytemps {
    public static void main(String[] args) {
        // Create Arraylist to store days of the week and corresponding average temps.
        ArrayList<String> daysOfWeek = new ArrayList<String>();
        ArrayList<Double> avgTemperatures = new ArrayList<Double>();
        // Ask the user to enter the daily temperatures for each day of the week.
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the average temperature for ");
            switch (i) {
                case 0:
                    System.out.print("Monday: ");
                    break;
                case 1:
                    System.out.print("Tuesday: ");
                    break;
                case 2:
                    System.out.print("Wednesday: ");
                    break;
                case 3:
                    System.out.print("Thursday: ");
                    break;
                case 4:
                    System.out.print("Friday: ");
                    break;
                case 5:
                    System.out.print("Saturday: ");
                    break;
                case 6:
                    System.out.print("Sunday: ");
                    break;
            }
            double temperature = input.nextDouble();
            // Add the day and temp to their ArrayLists
            daysOfWeek.add(getDayOfWeek(i));
            avgTemperatures.add(temperature);
        }
        // Ask user to enter day of the week or the word week to get the temp or average temp for the week.
        while (true) {
            System.out.print("\nEnter a day of the week or \"week\" to display the temperature(s), or \"quit\" to end the program: ");
            String day = input.next();

            // Option to end program if user enters the word "quit"
            if (day.equalsIgnoreCase("quit")) {
                System.out.println("Thank you for using. Goodbye!");
                break;
            }
            // See if the user entered the word "week" to display the average temps for the entire week.
            if (day.equalsIgnoreCase("week")) {
                double sum = 0;
                for (int i = 0; i < avgTemperatures.size(); i++) {
                    sum += avgTemperatures.get(i);
                }
                double avgTemperature = sum / avgTemperatures.size();
                System.out.println("The weekly average temperature is: " + avgTemperature + " degrees.");
                continue;
            }
            // Find the index of the users input day in the daysOfWeek Arraylist
            int index = -1;
            for (int i = 0; i < daysOfWeek.size(); i++) {
                if (daysOfWeek.get(i).equalsIgnoreCase(day)) {
                    index = i;
                    break;
                }
            }
            // Check if the user entered a valid day of the week or not.
            if (index == -1) {
                System.out.println("Invalid entry. Please enter a valid day of the week or \"week\".");
                continue;
            }
            // Show the day and temp for the users input day of the week.
            System.out.println("The average temperature for " + daysOfWeek.get(index) + " is " + avgTemperatures.get(index) + " degrees.");
        }
    }
    // Return day of the week based on the index of the for loop
    private static String getDayOfWeek(int index) {
        switch (index) {
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            case 5:
                return "Saturday";
            case 6:
                return "Sunday";
            default:
                return "";

        }
    }
}