package Homework4;

public class Task4 {
    public static void main(String[] args) {
        int[][] numbers = new int[8][8];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i + j == numbers.length - 1 || i + j == numbers.length || i + j == numbers.length + 1 || i + j == numbers.length + 2 || i + j == numbers.length + 3 || i + j == numbers.length + 4 || i + j == numbers.length + 5 || i + j == numbers.length + 6)
                {
                    System.out.print(numbers [i] [j] + " ");}
                else {
                    System.out.print(" " + " ");
                }


            }
            System.out.println();
        }

    }
}
