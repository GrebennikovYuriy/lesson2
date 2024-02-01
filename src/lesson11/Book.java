package lesson11;

import java.util.Objects;

public class Book extends PrintEdition {
    protected String author;
    protected int counOfPages;

    public Book() {
    }

    public Book(String name, int year, String publisher, String author, int counOfPages) {
        super(name, year, publisher);
        this.author = author;
        this.counOfPages = counOfPages;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCounOfPages() {
        return counOfPages;
    }

    public void setCounOfPages(int counOfPages) {
        this.counOfPages = counOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return counOfPages == book.counOfPages && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, counOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", counOfPages=" + counOfPages +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
