package lesson4;

public class Task2 {
    public static void main(String[] args) {
        int[][] numbers= {
                {1, 2, 3}, //0
                {3, 5, 6}, //1
                {5, 3, 2}, //2
                {1, 4, 5}, //3
        };
        for (int i = 0; i < numbers.length; i++) {//По этажам
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers [i][j] + " ");

            }

        }
    }
}
