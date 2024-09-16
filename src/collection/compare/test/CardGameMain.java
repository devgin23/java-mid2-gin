package collection.compare.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class CardGameMain {
    public static void main(String[] args) {
        ArrayList<Card> deck = Card.makeDeck();
        Collections.shuffle(deck);

        ArrayList<Card> player1 = new ArrayList<>();
        int player1Sum = 0;
        for (int i = 0; i < 5; i++) {
            Card thisCard = deck.remove(0);
            player1.add(thisCard);
            player1Sum += thisCard.getNumber();
        }
        player1.sort(null);
        System.out.println("player1 = " + player1);
        System.out.println("player1 score = " + player1Sum);


        ArrayList<Card> player2 = new ArrayList<>();
        int player2Sum = 0;
        for (int i = 0; i < 5; i++) {
            Card thisCard = deck.remove(0);
            player2.add(thisCard);
            player2Sum += thisCard.getNumber();
        }
        player2.sort(null);
        System.out.println("player2 = " + player2);
        System.out.println("player2 score = " + player2Sum);


        String result = "";
        result = player1Sum < player2Sum ? "==== player2 Win!! ====" : player1Sum == player2Sum ? "무승부" : "==== player1 Win!! ====";
        System.out.println(result);
    }
}
