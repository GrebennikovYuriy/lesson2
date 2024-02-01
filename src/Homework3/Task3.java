package Homework3;

public class Task3 {
    //Есть массив цифр: {3, 5, 8, 3, 55, 4, 1, 65, 36, 98}
    //3)Вывести на консоль те числа, которые содержат символ 5
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for (int i = 0; i < numbers.length; i++) {
           String currentNum = numbers[i] + "";
           if (currentNum.contains("5"))
            {
                System.out.println(currentNum);
            }
        }
    }
}
