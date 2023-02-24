import java.util.Scanner;

public class loopsContinueTest {
     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Input positive integers (0 exits): ");
            int number = Integer.valueOf(reader.nextLine());

            // if number is 0, exit loop
            if (number == 0) {
                break;
            } else if (number < 0) {
                // if number is negative, continue from beginning of loop
                System.out.println("Unfit number! Try again.");
                continue;
            }

            System.out.println("Your input was " + number);
        }
     }
}
