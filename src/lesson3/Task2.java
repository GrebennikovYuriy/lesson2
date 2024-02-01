package lesson3;

public class Task2 {
    public static void main(String[] args) {
int[] numbers = {1, 5, 8, 11, 13, 18};
for (int i = numbers.length - 1; i >= 0; i--){
    if (numbers[i] % 2 == 0)
        System.out.println(numbers[i]);

}
    }
}
