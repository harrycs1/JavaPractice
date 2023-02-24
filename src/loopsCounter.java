import java.util.Scanner;

public class loopsCounter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // if we wish to use a variable after a loop, it must be introduced before the loop or it will be a local variable
        int negativeNumbers = 0;

        // for repeatedly asking for numbers until break
        while (true) {
            System.out.println("Give a number (0 exits): ");
            int input = Integer.valueOf(reader.nextLine());

            if (input < 0) {
                negativeNumbers++;
            }

            if (input == 0) {
                System.out.println("Number of negative numbers: " + negativeNumbers);
                break;
            }

        }
    }

}
