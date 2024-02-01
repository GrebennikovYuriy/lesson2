package Homework3;

public class Task2 {
    public static void main(String[] args) {
        //Есть массив цифр: {3, 5, 8, 3, 55, 4, 1, 65, 36, 98}
        //2) Вывести на консоль массив с обратной стороны
        int[] numbers = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for (int i = 9; i < numbers.length; i--) {
            {
                System.out.println(numbers[i]);
            }
        }
    }
}
