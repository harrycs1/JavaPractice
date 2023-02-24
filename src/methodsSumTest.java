public class methodsSumTest {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 4;
        int number3 = 1;

        System.out.println("The sum of the numbers is " + sum(number1, number2, number3));
        System.out.println("The avg of the numbers is " + average(number1, number2, number3));
    }

    public static int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static double average(int number1, int number2, int number3) {
        return sum(number1, number2, number3) / 3.0;
    }
}
