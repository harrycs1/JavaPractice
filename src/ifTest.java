import java.util.Scanner;

public class ifTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed: ");

        int speed = Integer.valueOf(scanner.nextLine());

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}


// comparison values can also be used outside of conditions. In those cases, the boolean value resulting from the comparison is stored in a boolean variable for later use.
// int first = 1;
// int second = 3;
// boolean isGreater = first < second; --> true
