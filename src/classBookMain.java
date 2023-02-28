import java.util.Scanner;
import java.util.ArrayList;

public class classBookMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<classBook> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = reader.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(reader.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(reader.nextLine());

            books.add(new classBook(title, pages, publicationYear));
        }

        System.out.print("What information will be printed? ");
        String information = reader.nextLine();

        if (information.equals("everything")) {
            for (classBook book: books) {
                System.out.println(book);
            }
        } else if (information.equals("name")) {
            for (classBook book: books) {
                System.out.println(book.getTitle());
            }
        }
    }
}