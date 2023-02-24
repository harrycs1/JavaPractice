// the definition of a method tells us whether that method returns a value or not
// if it doesm the method definition has to include the type of the returned value
// otherwise the keyword "void" is used in the definition, meaning the method does not return any values

public class methodsReturnValues {
    public static void main(String[] args) {
        // for the return value of a method to be used, it must be stored in a variable
        int number = alwaysReturn10();

        System.out.println("the method returned the number " + number);
    }

    public static int alwaysReturn10() {
        // to return a value, we use the "return" keyword
        return 10;
        // when execution inside a method reaches the "return" command, the execution of that method ends and the value is returned to the calling method
        
    }
}
