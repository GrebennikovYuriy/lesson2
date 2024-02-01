package lesson4;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        // Вывести на экран каждую секунду минуту час день месяц год
        for (int year = 0; year < 10; year++) {
            for (int month = 0; month < 12; month++) {
                for (int day = 0; day < 31; day++){
                    for (int hour = 0; hour < 24; hour++){
                        for (int minute = 0; minute < 60; minute++){
                            for (int sec = 0; sec < 60; sec++){
                                System.out.printf("Со старта прошло %d год, %d месяца, %d дня, %d часа, %d минут, %d секунд\n",
                                        year, month, day, hour, minute, sec);
                                Thread.sleep(1000);
                            }
                        }
                    }
                }
            }

        }
    }
}
