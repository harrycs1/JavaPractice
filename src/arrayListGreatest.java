// program that asks the user for numbers (enter -1 to stop)
// then returns the largest number that was inputted

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListGreatest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();

        while(true) {
            System.out.print("Input number (-1 ends): ");
            int newNum = Integer.valueOf(reader.next());

            if (newNum == -1) {
                break;
            }

            numList.add(newNum);

        }

        int greatestNum = numList.get(0);
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) > greatestNum) {
                greatestNum = numList.get(i);

            }
        }

        System.out.println("The largest number that you input was " + greatestNum);
    }
}
