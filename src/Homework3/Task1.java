package Homework3;

public class Task1 {
    //Есть массив цифр: {3, 5, 8, 3, 55, 4, 1, 65, 36, 98}
    //1)Вывести на консоль через ячейку
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for (int i = 0; i < numbers.length; i = i + 2) {
            {
                System.out.println(numbers[i + 1]);
            }
        }
    }
}
