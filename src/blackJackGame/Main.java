package blackJackGame;

import java.sql.SQLOutput;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Dealer dealer = new Dealer();

        player1.setName("Ричард");
        player2.setName("Зина");
        player3.setName("Антон");
        dealer.setName("Крупье");

        BlackJack blackJack = new BlackJack ();
        blackJack.addPlayerToGame(player1);
            blackJack.addPlayerToGame(player2);
            blackJack.addPlayerToGame(player3);
            blackJack.addPlayerToGame(dealer);

            blackJack.dealTwoCardsAllPlayers();
            blackJack.dealRestCardsToAllPlayers();

//        Deck deck = new Deck(); //Ожидается, что внутри колоды 52 карты
//        deck.prepare(); //Наполнили колоду 52 картами
//        System.out.println(deck.getRandomCard().getNominal());

    }
}
