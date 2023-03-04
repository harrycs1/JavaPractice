import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class JokeManager {
    private Scanner reader;
    private ArrayList<String> jokes;

    //constructor
    public JokeManager(ArrayList jokes, Scanner reader) {
        this.reader = reader;
        this.jokes = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.println("Tell us a joke");
            String joke = reader.nextLine();

            if (joke.equals("break")) {
                break;
            }

            jokes.add(joke);
        }

        System.out.println("Bye!");

        for (String joke: this.jokes) {
            System.out.println(joke);
        }
        
    }
    
    public void add(String joke){
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.size() == 0) {
            return "Jokes are in short supply";
        } else {
            int index = (int) Math.random() * jokes.size();
            return index + " --- " + jokes.get(index) + " --- " + jokes.size();
        }
    }

    public void printJokes() {
        for (String joke: this.jokes) {
            System.out.println(joke);
        }
    }
}
