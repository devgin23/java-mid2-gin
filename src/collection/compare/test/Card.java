package collection.compare.test;

import collection.compare.MyUser;

import java.util.ArrayList;
import java.util.Map;

public class Card implements Comparable<Card> {
    public static final int[] NUMBERS = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    public static final String[] PATTERNS = {"\u2660","\u2665","\u2666","\u2663"};
    public static final Map<String, Integer> PATTERN_PRIORITY
            = Map.of("\u2660", 1,"\u2665",2,"\u2666",3,"\u2663",4);
    private int number;
    private String pattern;

    public int getNumber() {
        return number;
    }

    public String getPattern() {
        return pattern;
    }

    public Card(int number, String pattern) {
        this.number = number;
        this.pattern = pattern;
    }

    public static ArrayList<Card> makeDeck() {
        ArrayList<Card> newDeck = new ArrayList<>();
        for (int number : NUMBERS) {
            for (String pattern : PATTERNS) {
                newDeck.add(new Card(number, pattern));
            }
        }
        System.out.println("========= makeNewDeck ========");
        return newDeck;
    }

    @Override
    public String toString() {
        return number + "("+pattern+")";
    }

    @Override
    public int compareTo(Card o) {
        return this.number < o.number ? -1 : (this.number == o.number ?
                (PATTERN_PRIORITY.get(this.pattern) < PATTERN_PRIORITY.get(o.pattern) ? -1 : 1) : 1);
    }
}
