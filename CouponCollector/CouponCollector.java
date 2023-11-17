package problem1;

import java.util.ArrayList;

public class CouponCollector {
    DeckOfCards deck=new DeckOfCards();

    void simulation(){
        deck.shuffle();
        ArrayList<String> collectedSuits=new ArrayList<>();
        int numOfPicks=0;
        while(collectedSuits.size()<4){
            Card picked=deck.dealCard();
            String suit=picked.getSuit();
            numOfPicks++;

            if(!collectedSuits.contains(suit)){
                collectedSuits.add(suit);
                System.out.println(picked.toString());
            }
        }
        System.out.println("Number of picks: "+numOfPicks);
    }


}
