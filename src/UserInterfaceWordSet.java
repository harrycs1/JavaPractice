import java.util.ArrayList;

public class UserInterfaceWordSet {
    private ArrayList<String> words;

    //constructor
    public UserInterfaceWordSet() {
        this.words = new ArrayList<>();
    }

    public void add(String word) {
        this.words.add(word);
    }

    public boolean contains(String word) {
        return this.words.contains(word);
    }
}
