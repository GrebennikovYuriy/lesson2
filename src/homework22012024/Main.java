package homework22012024;

public class Main {
    public static void main(String[] args) {
String [] printedPublications = new String[1000];
        Books instance1 = new Books("Война и мир", "Лев Толстой", 1865, 1173, "Русский вестник");
        Books instance2 = new Books("Анна Каренина", "Лев Толстой", 1875, 567, "Русский вестник");
        Books instance3 = new Books("Преступление и наказание", "Федор Достоевский", 1866, 856, "Русский роман");
        Books instance4 = new Books("Лолита", "Владимир Набоков", 1955, 378, "Олимпия Пресс");

        Magazines instance5 = new Magazines("Юный техник", 1956, 5, "Молодая гвардия");
        Magazines instance6 = new Magazines("Редкие земли", 2015, 3, "Черноба");
        Magazines instance7 = new Magazines("Наука и техника", 2007, 4, "Интер");
        Magazines instance8 = new Magazines("Вокруг света", 2021, 5, "Издательство");
            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println(instance3);
            System.out.println(instance4);
            System.out.println(instance5);
            System.out.println(instance6);
            System.out.println(instance7);
            System.out.println(instance8);


    }
}
