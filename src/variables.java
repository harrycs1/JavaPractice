// A variable's type is specified when it is intially declared
// The variable type is stated when the variable is first decalred. When a new value is assigned to the variable, the type is no longer declared
// int types hold whole numbers
// String types hold text
// double types hold floating point numbers
// boolean types are either true or false

// the Integer.valueOf() command converts a string to an integer. It takes a string containing the value to be converted as a parameter.

public class variables {

    public static void main(String[] args) {

        String valueAsString = "42";
        int value = Integer.valueOf(valueAsString);
    
        System.out.println(value);
    }
}

// the Double.valueOf() command converts a string into a double. It takes a string containing the value to be converted as a parameter. 
// it is possible to read an integer variable into a double, in which case the value is converted automatically into a type double.

// the Boolean.valueOf() command converts a string to a boolean.
// when converting a string to boolean, the string must be "true" if we want the boolean to be true. All other strings turn into the boolean false.

