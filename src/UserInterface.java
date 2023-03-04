import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private UserInterfaceWordSet wordSet;

    //constructor
    public UserInterface(Scanner reader, UserInterfaceWordSet wordSet) {
        this.reader = reader;
        this.wordSet = wordSet;
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String word = reader.nextLine();

            if (this.wordSet.contains(word)) {
                break;
            }

            this.wordSet.add(word);
        }
        System.out.println("You have the same word twice");
    }
}
