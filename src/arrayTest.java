

public class arrayTest {
    public static void main(String[] args) {
        // There are 2 ways of creating an Array.

        // 1) add square brackets after the type of elements it contains -- typeofelements[]
            // in this method, the size of the array must be explicitly defined
            // A new Array is created by calling "new" followed by the type of the elements, square brackets and the number of elements
        int[] numbers = new int[3];

        // an element of an Array is referred to by its index.
        // assign the value of 20 to the element at index 0:
        numbers[0] = 20;
        numbers[1] = 23;
        numbers[2] = 3;

        System.out.println(numbers[1]); // prints 23

        // you can find the size of an array throught the associated variable "length"
        System.out.println(numbers.length); // prints 3

        // 2) the second way to create an array (the shorter way)
        int[] moreNumbers = {234, 267, 322}; 
        // when you initilaise an array with a block, the length of the array is precisely the number of the values specified in the block
        // the values of the blocl are assigned to the array in order
        System.out.println(moreNumbers[2]); // prints 322
    }
}