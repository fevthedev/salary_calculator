import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String welcomeMessage = "Initializing salary calculator...";
        String goodByeMessage = "Terminating salary calculator. Good bye!";
        boolean allDone = false;


        System.out.println(welcomeMessage);

        while(!allDone) {
            System.out.println("Enter your hourly rate:");

            try {
                // Run calculations on hourly rate
                float hourlyRate = 0;
                while (hourlyRate == 0) {

                    if (scanner.hasNextDouble()) {
                        hourlyRate =  scanner.nextFloat();
                        System.out.println("Hourly Rate = $" + hourlyRate);
                    } else {
                        System.out.println("Please enter a numerical value.");
                        scanner.next();
                    }
                }
                System.out.println("Daily income: $" + Tax.calculateDailyTotal(hourlyRate));
                System.out.println("Weekly income: $" + Tax.calculateWeeklyTotal(hourlyRate));
                System.out.println("Bi-Weekly income: $" + Tax.calculateBiWeeklyTotal(hourlyRate));
                System.out.println("Monthly income: $" + Tax.calculateMonthlyTotal(hourlyRate));

            } catch (InputMismatchException err) {
                System.out.println("You've entered an invalid entry. Please choose one of the numeric values beside you desired choice.");
            } catch (Exception err) {
                System.out.println("There has been an error. Please close the program and try again!");
            } finally {
                System.out.println("Calculate new rate? Enter Y/N");
                String response = scanner.next();
                while (!response.equalsIgnoreCase("n") && !response.equalsIgnoreCase("y")) {
                    System.out.println("Please enter Y or N to continue");
                    response = scanner.next();
                }

                if (response.equalsIgnoreCase("n")) {
                    System.out.println("entered n");
                    allDone = true;
                } else if (response.equalsIgnoreCase("y")) {
                    System.out.println("entered y");
                    allDone = false;
                }
            }
        }

        System.out.println(goodByeMessage);
        scanner.close();

    }
}