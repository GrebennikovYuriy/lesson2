package Homework3;

public class Task5 {
    //Есть текст "Я буду лучше учиться"
    //5) Напечатать на консоль каждое слово в обратном порядке
    public static void main(String[] args) {
        String text = "Я буду лучше учиться";
         String reverse = new StringBuffer(text).reverse().toString();
                 System.out.println(reverse);
    }
}
