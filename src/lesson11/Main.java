package lesson11;

public class Main {
    public static void main(String[] args) {
        PrintEdition[] printEditions = new PrintEdition[6];
        printEditions[0] = new Book("451 градусов по фарингейту", 1953, "Просвещение",
                "Рей Бредбери", 450);
        printEditions[1] = new Book("1984", 1953, "Новый свет",
                "Джордж Оруелл", 500);
        printEditions[2] = new Book("Тихий дон", 1953, "Издательство",
                "Михаил Александрович Шолохов", 1000);
        printEditions[3] = new Magazines("Мастер", 2010, "Супер журнал", 5);
        printEditions[4] = new Magazines("Дом и сад", 2005, "Супер журнал", 2);
        printEditions[5] = new Magazines("Программист", 2020, "Супер журнал", 7);
        /**
         * Возможность одного и того же кода, работать с разными типами данных как с одинаковыми,
         * но результат выполнения кода меняется в зависимости от типа объекта по разному
         */
        for (PrintEdition printEdition : printEditions) {
            System.out.println(printEdition);

        }
    }

    /**
     * Найди самую "толстую книгу"
     *
     * @param printEditions
     */
    public static void FindTheThickestBook(PrintEdition[] printEditions) {


    }
}
