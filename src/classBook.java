public class classBook {
    private String title;
    private int pages;
    private int publicationYear;

    // constructor that requires 2 parameters to create object
    public classBook(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    
    //methods
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }

    public String getTitle() {
        return this.title;
    }
}
