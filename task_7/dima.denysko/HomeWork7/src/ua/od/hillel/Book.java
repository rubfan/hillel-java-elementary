package ua.od.hillel;

/**
 * Created by dmytro.denysko on 23.03.2018.
 */
public class Book {
    private String author;
    private String bookTitle;
    private int percentReading;

    public Book(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
        percentReading = 0;
    }

    public void getInfo() {
        System.out.println(author + ' ' + bookTitle);
    }

    public boolean checkPercent() {
        if (percentReading < 100) return true;
        else return false;
    }

    public void readingBook() {
        percentReading += 50;
    }
}
