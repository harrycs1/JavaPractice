// calculating with numbers is the same as always
import java.util.Scanner;


public class calculatingWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert into seconds? ");
        int days = Integer.valueOf(scanner.nextLine());

        System.out.println(days * 86400);
    }
}


// the types of the variables that are part of the calculation determine the type of result acheived by executing the command.
// if all variables in a division calculation are integers, the resultling value in an integer as well.
// int result = 3 / 2 --> 1
// if the dividend or divisor (or both) is a floating point number, the results is a floating point number as well.
// double result = 3.0 / 2 = 1.5

// an integer can be converted into a floating point number by placing a type-casting operation (double) befor it
// int first = 3;
// int second = 2;
// double result = (double) first / second --> 1.5