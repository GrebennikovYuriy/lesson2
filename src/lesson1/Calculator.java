package lesson1; //адрес файла

public class Calculator {
    public static void main(String[] args) {
        int a = 5; /*Число а = 5 */
        int b = 7; //Число b = 7
        int c = 9;
        int result = (a + b + c);
        System.out.println(result);
        double a1 = 2.5;
        double b1 = 5.5;
        double result1 = (a1 + b1) * 2;
        System.out.println(result1);
        char a2 = 1234;
        System.out.println(a2);
        System.out.println(1 == 2);
//Длина и ширина стола
        int lengthOfTable = 10;
        int widthOfTable = 5;
        //Длина и ширина комнаты
        int lengthOfRoom = 100;
        int widthOfRoom = 50;

        int areaOfTable = lengthOfTable * widthOfTable;
        int areaOfRoom = lengthOfRoom * widthOfRoom;

        int count = areaOfRoom / areaOfTable;
        System.out.println(count);

    }

}
