import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<>();
        for(SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                Card card = new Card(suit,rank);
                this.deck.add(card);
            }
        }
    }


    public int countCards() {
        return this.deck.size();
    }

    public Card removeCard() {
        return this.deck.remove(0);
    }

    public void shuffle() {
//        System.out.println(deck);
        Collections.shuffle(this.deck, new Random(1));
//        System.out.println(deck);
    }


}
