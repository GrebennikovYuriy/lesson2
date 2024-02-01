package lesson2;

public class Task2 {
    public static void main(String[] args) {
        int a1 = 7;
        int b1 = 9;
        int c1 = 9;
        if (a1 == b1 && b1 == c1 && c1 == a1) {
            System.out.println("Это равносторонний треугольник");

        }
        else if (a1 != b1 && b1 != c1 && c1 != a1) {
            System.out.println("Это разносторонний треугольник");

        }
        else {
            System.out.println("Это равнобедренный треугольник");

        }
        //циклы
        //Вывести на консоль 10 раз слово Привет
        for (int i = 0; i < 10; i++) {
            System.out.println("Привет!");

        }
        //Напечатать на консоль четные числа от 30 до 50
        for (int i = 30; i <= 50; i = i + 2) {
            System.out.println(i);

        }
        // Напечатать числа от 30 до 300 кратные 3 и 5
        for (int i = 30; i <= 300; i++) {
            if (i % 3 == 0 && i % 5 == 0)
            System.out.println(i);

        }
    }
}
