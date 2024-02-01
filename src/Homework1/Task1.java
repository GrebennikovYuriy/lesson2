package Homework1;

public class Task1 {
    public static void main(String[] args) {
        int money = 1000;
        int costOfSnikers = 35;
        double costOfCandy = 3.5;
        int countCanSnikBy = money / costOfSnikers;
        int rest = money % costOfSnikers;
        // 2 вида преобразований:
        // внизсходящий
        // вверхсходящий
        int countCanCandyBy = (int) (rest / costOfCandy);
        double totalRest = rest - (countCanCandyBy * costOfCandy);
        System.out.println(countCanSnikBy);
        System.out.println(countCanCandyBy);
        System.out.println(totalRest);
    }
}
