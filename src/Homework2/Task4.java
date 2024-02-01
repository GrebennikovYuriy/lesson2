package Homework2;

public class Task4 {
    public static void main(String[] args) {
        //С помощью цикла For, напечатать на консоль:
        //4.***Посчитать сколько нужно лет, чтобы собрать сумму
        // в 200 т.рублей, если ежемесячно откладывать по 9500
      int month = 0;
        for (int money = 0; money <=200000; money = money + 9500) {
            month++;
        }
          System.out.println(month / 12.0);
        }

    }

