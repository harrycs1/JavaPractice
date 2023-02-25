// strings cannot be compared with the equals operator ==
// the .equals() command must be used instead

public class stringTest {
    public static void main(String[] args) {

        String text = "first second third fourth";

        // you can split a string to multiple pieces with the .split() method
        // the parameter of the .split() method is the characters denoting the place you want to split the string

        String[] pieces = text.split(" "); // split the string called text at each " "
        System.out.println(pieces[0]); // prints first
    }
}

