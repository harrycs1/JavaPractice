import java.util.Scanner;

public class userInterfaceMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        UserInterfaceWordSet set = new UserInterfaceWordSet();

        UserInterface userInterface = new UserInterface(reader, set);
        userInterface.start();
    }
    
}
