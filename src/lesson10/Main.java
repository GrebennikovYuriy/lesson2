package lesson10;

public class Main {
    public static void main(String[] args) {
        Student richard = new Student(30, "Ричард Сапогов");
        Student richardBrother = new Student(30, "Ричард Сапогов");
//        System.out.println(richard.getClass());
//        Student anotherRichard = richard;
//        System.out.println(richard.equals(richardBrother));
//        System.out.println(richard.getClass());
//Student exemple1 = (Student) new Object();
//Object exemple2 = new Student(1, "имя");
        System.out.println(richard.toString());

    }


}
