package Homework3;

public class Task4 {
    //Есть текст "Я буду лучше учиться"
    //4) Напечатать на консоль каждое слово в отдельной строке
    public static void main(String[] args) {
        String text = "Я буду лучше учиться";
        String[] words = text.split(" ");
        for (String word : words)
        System.out.println(word);
         }
}
