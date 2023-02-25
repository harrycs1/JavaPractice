// if you dont need to keep track of the index as you're going through a list, you can make use of the for-each loop
// the for-each expression is defined in the following format:
// for (TypeOfVariable nameOfVariable: nameOfList)
// where TypeOfVariable is the list's element type, and nameOfVariable is the variable that is used to store each value in the list

import java.util.ArrayList;

public class loopsForEach {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Mary");
        teachers.add("Jane");
        teachers.add("Julie");

        for (String teacher: teachers) {
            System.out.println(teacher);
        }

        System.out.println("");

        // the .remove() method removes the value located at the end of the list
        teachers.remove(1);
        for (String teacher: teachers) {
            System.out.println(teacher);
        }

        System.out.println("");

        // if the list contains integers, you cannot remove a number value by giving an int type parameter to remove the method.
        // instead you can convert the parameter to integer type with the .valueOf() method.

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(15);
        numList.add(124);
        numList.add(4);
        numList.add(24);

        for (int number: numList) {
            System.out.println(number);
        }

        numList.remove(Integer.valueOf(124));

        System.out.println("");

        for (int number: numList) {
            System.out.println(number);
        }
    }
}
