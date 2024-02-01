package lesson2;

public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a);
        int b = 10;
        b--;
        System.out.println(b);
        int priceRoome = 100;
        priceRoome += 50;
        System.out.println(priceRoome);
// Задача: есть число, нужно напечатать на консоль true - если четное, false - если не четное.
        int number = 13;
        int ostatokDeleniaNa2 = number % 2;
        System.out.println(ostatokDeleniaNa2 == 0);
        // Есть 3 стороны треугольника, и нужно вывести: разносторонний, равносторонний или равнобедренный
        // управляющая конструкция if else
        int a1 = 7;
        int b1 = 9;
        int c1 = 9;
        if (a1 == b1 && b1 == c1 && c1 == a1) {
            System.out.println("Это равносторонний треугольник");

        }
        if (a1 != b1 && b1 != c1 && c1 != a1) {
            System.out.println("Это разносторонний треугольник");

        }
        if ((a1 == b1 && b1 != c1 && c1 != a1) || (a1 != b1 && b1 == c1 && c1 != a1) || (a1 != b1 && b1 != c1 && c1 == a1)) {
            System.out.println("Это равнобедренный треугольник");

        }
    }

}
