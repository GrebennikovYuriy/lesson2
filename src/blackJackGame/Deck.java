package blackJackGame;

import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    /**
     * Колода
     */
    Card[] cards = new Card[52];

    /**
     * Создает 52 карты и кладет их в массив
     */
    public void prepare(){
        cards[0] = new Card("Двойка крести", 2);
        cards[1] = new Card("Двойка бубна", 2);
        cards[2] = new Card("Двойка пики", 2);
        cards[3] = new Card("Двойка черви", 2);

        cards[4] = new Card("Тройка крести", 3);
        cards[5] = new Card("Тройка бубна", 3);
        cards[6] = new Card("Тройка пики", 3);
        cards[7] = new Card("Тройка черви", 3);

        cards[8] = new Card("Четверка крести", 4);
        cards[9] = new Card("Четверка бубна", 4);
        cards[10] = new Card("Четверка пики", 4);
        cards[11] = new Card("Четверка черви", 4);

        cards[12] = new Card("Пятерка крести", 5);
        cards[13] = new Card("Пятерка бубна", 5);
        cards[14] = new Card("Пятерка пики", 5);
        cards[15] = new Card("Пятерка черви", 5);

        cards[16] = new Card("Шестерка крести", 6);
        cards[17] = new Card("Шестерка бубна", 6);
        cards[18] = new Card("Шестерка пики", 6);
        cards[19] = new Card("Шестерка черви", 6);

        cards[20] = new Card("Семерка крести", 7);
        cards[21] = new Card("Семерка бубна", 7);
        cards[22] = new Card("Семерка пики", 7);
        cards[23] = new Card("Семерка черви", 7);

        cards[24] = new Card("Восьмерка крести", 8);
        cards[25] = new Card("Восьмерка бубна", 8);
        cards[26] = new Card("Восьмерка пики", 8);
        cards[27] = new Card("Восьмерка черви", 8);

        cards[28] = new Card("Девятка крести", 9);
        cards[29] = new Card("Девятка бубна", 9);
        cards[30] = new Card("Девятка пики", 9);
        cards[31] = new Card("Девятка черви", 9);

        cards[32] = new Card("Десятка крести", 10);
        cards[33] = new Card("Десятка бубна", 10);
        cards[34] = new Card("Десятка пики", 10);
        cards[34] = new Card("Десятка черви", 10);

        cards[36] = new Card("Валет крести", 11);
        cards[37] = new Card("Валет бубна", 11);
        cards[38] = new Card("Валет пики", 11);
        cards[39] = new Card("Валет черви", 11);

        cards[40] = new Card("Дама крести", 12);
        cards[41] = new Card("Дама бубна", 12);
        cards[42] = new Card("Дама пики", 12);
        cards[43] = new Card("Дама черви", 12);

        cards[44] = new Card("Король крести", 13);
        cards[45] = new Card("Король бубна", 13);
        cards[46] = new Card("Король пики", 13);
        cards[47] = new Card("Король черви", 13);

        cards[48] = new Card("Туз крести", 10);
        cards[49] = new Card("Туз бубна", 10);
        cards[50] = new Card("Туз пики", 10);
        cards[51] = new Card("Туз черви", 10);

    }

    /**
     * Метод возвращает одну рандомную карту
     * @return
     */
    public Card getRandomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51 + 1);
        return cards[randomNum];
}
}
