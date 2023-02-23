import java.util.Scanner;

public class GreetingTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name);
    }
}
