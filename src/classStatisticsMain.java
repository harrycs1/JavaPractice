import java.util.Scanner;

public class classStatisticsMain {
    public static void main(String[] args) {
        // initialise scanner as "reader"
        Scanner reader = new Scanner(System.in);

        // initialise classStatistics objects
        classStatistics statistics = new classStatistics();
        classStatistics evenStatistics = new classStatistics();
        classStatistics oddStatistics = new classStatistics();

        // while loop to enable end program if number inputted is -1
        while (true) {
            // message to terminal asking user to input number
            System.out.print("Input number (-1 ends): ");
            // assigning the user input as an integer object called "number"
            int number = Integer.valueOf(reader.nextLine());

            // end program if number inputted is -1
            if (number == -1) {
                break;
            } else if (number % 2 == 0) {
                // else, if number is even, use addNumber() method to add "number" to statistics object
                statistics.addNumber(number);
                // use .addNumber() to add "number" to evenStatistics object
                evenStatistics.addNumber(number);
            } else {
                // else, number is odd, use addNumber() method to add "number" to statistics object
                statistics.addNumber(number);
                // use .addNumber() to add "number" to oddStatistics object
                oddStatistics.addNumber(number);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
    }
}
