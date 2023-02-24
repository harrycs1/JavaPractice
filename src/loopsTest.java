import java.util.Scanner;

public class loopsTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            String answer = reader.nextLine();
            if (answer.equals("no")) {
                break;
            }
        }
    }
}
