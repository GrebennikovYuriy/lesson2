package homework22012024;

public class Magazines {
    protected String title;
    protected int yearOfRelease;
    protected int numberInYear;
    protected String publishingHouse;
    public Magazines(){

    }
    public Magazines(String title, int yearOfRelease, int numberInYear, String publishingHouse){
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.numberInYear = numberInYear;
        this.publishingHouse = publishingHouse;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getNumberInYear() {
        return numberInYear;
    }

    public void setNumberInYear(int numberInYear) {
        this.numberInYear = numberInYear;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", numberInYear=" + numberInYear +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
