package lesson14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        ArrayList<String> array = new ArrayList<>();

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            array.add("abc" + i);


        }
        long time2 = System.currentTimeMillis();
        System.out.println("ArrayList add: " + (time2 - time1));
        for (int i = 0; i < 1000000; i++) {
            linked.add("abc" + i);
        }

        long time3 = System.currentTimeMillis();
        System.out.println("LinkedList add: " + (time3 - time2));
        for (int i = 0; i < 1000000; i++) {
            array.get(i);

        }
        long time4 = System.currentTimeMillis();
        System.out.println("ArrayList add: " + (time4 - time3));
        for (int i = 0; i < 1000000; i++) {
            linked.get(i);

        }
        long time5 = System.currentTimeMillis();



        System.out.println("ArrayList add: " + (time5 - time4));

    }
}
