import java.util.ArrayList;
import java.util.Scanner;

public class arrayPersonMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<arrayPerson> people = new ArrayList<>();
    
        while (true) {
            System.out.print("Enter name (empty will end): ");
            String name = reader.nextLine();
    
            if (name.isEmpty()) {
                break;
            }
    
            System.out.println("Enter age of " + name + ": ");
            int age = Integer.valueOf(reader.nextLine());
    
            people.add(new arrayPerson(name, age));
        }

        System.out.println();
        System.out.println("Total number of persons: " + people.size());
        System.out.println("Persons:");

        for (arrayPerson person: people) {
            System.out.println(person);
        }
    }
}