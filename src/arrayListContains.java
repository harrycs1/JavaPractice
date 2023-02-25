import java.util.ArrayList;

public class arrayListContains {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");

        // the method .contains() can be used to check the existence of a value in a list.
        // The method recieves the value to be searched as its parameter, and returns a boolean type value

        if (list.contains("Second")) {
            System.out.println("Second can still be found");
        }
    }
}
