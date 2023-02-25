import java.util.ArrayList;
import java.util.Scanner;

public class stringDiverseText {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int greatestAge = 0;

        while(true) {
            System.out.print("Input name,age: ");
            String input = reader.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");

            if (Integer.valueOf(data[1]) > greatestAge) {
                greatestAge = Integer.valueOf(data[1]);
            }
        }

        System.out.println("Age of the oldest: " + greatestAge);
    }
}
