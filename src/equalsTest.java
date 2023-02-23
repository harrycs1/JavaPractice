// We can compare integers, floating points and booleans using two equals signs (variable1 == variable2)
// We CANNOT compare the equality of strings using two equals signs. 
// We have to use the .equals() command

import java.util.Scanner;

public class equalsTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Input two strings");
        String firstString = reader.nextLine();
        String secondString = reader.nextLine();

        if (firstString.equals(secondString)) {
            System.out.println("The strings were the same!");
        } else {
            System.out.println("The string were different!");
        }
    }
}