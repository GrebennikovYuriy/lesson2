package blackJackGame;

import java.util.ArrayList;

public class BlackJack {
    /**
     * Игра
     */
    private Deck deck = new Deck();

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    private ArrayList <Player> players = new ArrayList<>();
    public BlackJack(){
        deck.prepare();

    }
    public void addPlayerToGame(Player player){
        players.add(player);
    }
    public void dealTwoCardsAllPlayers(){
        for (Player player : players){
            player.addCardToHand(deck.getRandomCard());
            player.addCardToHand(deck.getRandomCard());
        }
    }
    public void dealRestCardsToAllPlayers(){
        for (Player player : players){
            while (player.doYouNeedMoreCards()){
                player.addCardToHand(deck.getRandomCard());
            }
        }
    }

    /**
     * 13 13 22 12 10 ------ 13 13 победитель
     * 24 26 22 22 23 ------ выиграл Крупье
     * 24 26 21 21 21 ------ 21 21 21
     * 20 20 20 20 20 ------ выиграли все
     * 17 19 20 24 18 ------ выиграл 20
     */
    public void printWinner(){
        for (Player player : players) {
if(player.countValueInHand() > 21){
    player.setCanWin(false);
}
        }
        if (countPlayerWhoCanWin() ==0){ //если у всех перебор - находим крупье и печатаем его карты
            for (Player player : players) {
                if(player instanceof Dealer){
                    System.out.println("Выиграл " + player.getName());
                    player.openHand();
                    return;
                }
            }
        }
        int winnerValue = 0;
        for (Player player : players) {
            if(player.isCanWin() && player.countValueInHand() > winnerValue){
                winnerValue = player.countValueInHand();

            }
        }
        for (Player player : players) {
            if(player.countValueInHand() == winnerValue){
                System.out.println("Выиграл" + player.getName());
            }

        }
    }
    public int countPlayerWhoCanWin(){
        int count = 0;
        for (Player player : players) {
        count++;

            }
        return count;
    }

}
