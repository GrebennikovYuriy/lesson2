package Homework2;

public class Task3 {
    public static void main(String[] args) {
        //С помощью цикла For, напечатать на консоль:
        //3. Кол-во четных чисел в диапазоне от 30 до 61
        int counter = 0;
        for (int i = 30; i < 61; i = i + 2) {
            if (i % 2 == 0) {
                counter++;
            }
            System.out.println(i);

        }
    }
}
