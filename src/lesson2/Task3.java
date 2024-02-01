package lesson2;

public class Task3 {
    public static void main(String[] args) {
        // Сколько денег мы вынесем с банка, если положим
        // 10 млн. на 15 лет под депозит 13 % годовых
        // капитализация каждый месяц
        double money = 1000000;

        for (int month = 0; month < 12 * 15; month++) {
            money = money + ((money * 0.13)/12);
        }
        System.out.println(money);
    }
}
