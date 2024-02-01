package lesson11;

import java.util.Objects;

public class PrintEdition {
    protected String name;
    protected int year;
    protected String publisher;

    public PrintEdition() {
    }

    public PrintEdition(String name, int year, String publisher) {
        this.name = name;
        this.year = year;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Имя установлено");
        this.name = name;
    }

    public void setName(int number) {
        System.out.println("Это число, введите текст");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "PrintEdition{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", publisher=" + publisher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrintEdition that = (PrintEdition) o;
        return publisher == that.publisher && Objects.equals(name, that.name) && Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, publisher);
    }
}
