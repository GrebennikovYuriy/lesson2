package lesson11;

import java.util.Objects;

public class Magazines extends PrintEdition {
    protected int numberInYear;

    public Magazines() {
    }

    public Magazines(String name, int year, String publisher, int numberInYear) {
        super(name, year, publisher);
        this.numberInYear = numberInYear;
    }

    public int getNumberInYear() {
        return numberInYear;
    }

    public void setNumberInYear(int numberInYear) {
        this.numberInYear = numberInYear;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "numberInYear=" + numberInYear +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazines magazines = (Magazines) o;
        return numberInYear == magazines.numberInYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberInYear);
    }
}
