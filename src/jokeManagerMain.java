import java.util.Scanner;
import java.util.ArrayList;

public class jokeManagerMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> jokes = new ArrayList<>();

        JokeManager jokeManager = new JokeManager(jokes, reader);
        jokeManager.start();
        System.out.println(jokeManager.drawJoke());
        // jokeManager.printJokes();
    }
}