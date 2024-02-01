package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - овал");
        System.out.println("4 - круг");
        System.out.println("5 - трапеция");

        //System.out.println("6  - преврати camel case в scream snake case");
        //nameOfHouse - camel case или верблюжий шрифт
        //NAME_OF_HOUSE - scream snake case - кричащий змеиный шрифт

        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();

        if (choose == 1) {
            System.out.println("Введите сторону а");
            int a = sc.nextInt();
            System.out.println("Введите сторону b");
            int b = sc.nextInt();
            System.out.println("Введите сторону c");
            int c = sc.nextInt();
            MathUtils.calculateAreaOfTriangle(a, b, c);
        }else if (choose == 2) {
            }
        //продолжить
        }
    }
