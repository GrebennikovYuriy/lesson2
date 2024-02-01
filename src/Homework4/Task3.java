package Homework4;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = new int[8][8];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                    if (i + j == numbers.length - 2 || j + (i) == numbers.length - 8 || j + (i) == numbers.length - 7 || j + (i) == numbers.length - 6 || j + (i) == numbers.length - 5 || j + (i) == numbers.length - 4 || j + (i) == numbers.length - 3)
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
