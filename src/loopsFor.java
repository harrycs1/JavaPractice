import java.util.Scanner;

public class loopsFor {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Last number? ");
        int lastNumber = Integer.valueOf(reader.nextLine());
        int result = 0;

        // a for loop contains 4 parts:
            // introduce the variable for counting the number of executions
            // the condition of the loop
            // increasing/decreasing the value of the counter varibale
            // the functionality to be executed
        for (int i = 0; i <= lastNumber; i++) {
            // will print i (starting from 0 and increasing by 1 on new line) until (i < 10) is no longer true
            // System.out.println(i);

            // calculates the sum of 1+2+3+..+n where n is given as lastNumber
            result += i;
        }
        
        System.out.println("The sum is " + result);
    }
}
