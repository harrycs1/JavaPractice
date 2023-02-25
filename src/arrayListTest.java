// ArrayList is a premade tool in hava that helps to deal with lists.

// For ArrayList to be used, it first needs to be imported into the program:
import java.util.ArrayList;

public class arrayListTest {
    public static void main(String[] args) {
        // creating a new list is done with the following command:
        ArrayList<String> wordList = new ArrayList<>();
        // When a list variable is initialised, the type of the values to be stored is also defined in addition to the variable type
        // As such, the type of an ArrayList that stores strings is "ArrayList<String>""
        // A new list is created with the command "new ArrayList<>()"
        // When defining the type of values that a list can include, the first letter of the element type has to be capiltalised
        // e.g. ArrayList<Integer> or ArrayList<Double>
        
        // Addition into an ArrayList is done with the "add()" method:
        wordList.add("First");
        wordList.add("Second");
        
        // To retreive a value from a certain position, use the list method "get()"

        // Retrieve the value from position 0 of the word list:
        String word = wordList.get(0);
        System.out.println(word);

        // check the size of an arrayList with the .size() method
        int arrayListSize = wordList.size();
        System.out.println("The length of the array is: " + arrayListSize);
    }
}
