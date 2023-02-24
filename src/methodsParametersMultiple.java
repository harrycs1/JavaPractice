public class methodsParametersMultiple {
    public static void main(String[] args) {
        sum(4, 5);
    }


    // a method can be defined with multiple parameters. When calling such a method, the parameters are passed in the same order.
    public static void sum(int first, int second) {
        System.out.println("The sum of the numbers " + first + " and " + second + " is " + (first + second));
    }
}