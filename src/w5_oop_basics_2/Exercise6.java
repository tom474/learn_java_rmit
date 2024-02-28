package w5_oop_basics_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise6 {
    public static void main(String args[]) {
        String[] suit = new String[] {"spades", "hearts", "diamonds", "clubs"};
        String[] rank = new String[] {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

        List deck = new ArrayList();

        for (int i=0; i<suit.length; i++) {
            for (int j=0; j<rank.length; j++) {
                deck.add(rank[j] + " of " + suit[i]);
            }
        }

        Collections.shuffle(deck);

        List hand = dealHand(deck, 4);
        System.out.println(hand);
    }

    public static List dealHand(List deck, int n) {
        List hand = new ArrayList(deck.subList(0,n));
        return hand;
    }
}
