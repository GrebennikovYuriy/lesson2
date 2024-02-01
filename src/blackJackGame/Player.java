package blackJackGame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Игрок
 */
public class Player {


    private String name;
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean canWin = true;

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    /**
     * Установи имя
     * @param name значение String, которое установится в качесте имени
     */
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }



    public void addCardToHand(Card randomCard) {
        hand.add(randomCard);

    }

    public boolean doYouNeedMoreCards() {
        System.out.println();
        System.out.println(name + ", Ваши карты: __________");
        openHand();
        System.out.println("_________________________");
        System.out.println("Вам нужна еще одна карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")){
            return true;
        }
        return false;
    }
    public void openHand(){
        for (Card card : hand) {
            System.out.println(card);

        }
    }
    public int countValueInHand(){
        int count = 0;
        for (Card card : hand) {
       count += card.getValue();
        }
        return count;
    }
}
