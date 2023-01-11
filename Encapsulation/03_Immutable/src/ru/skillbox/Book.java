public class Book {
    private final String name;
    private final String author;
    private final int numberOfPages;
    private final int numberISBN;

    public Book(String name, String author, int numberOfPages, int numberISBN) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.numberISBN = numberISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getNumberISBN() {
        return numberISBN;
    }
}
