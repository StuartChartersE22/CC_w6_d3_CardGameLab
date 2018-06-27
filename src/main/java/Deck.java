import javax.swing.*;
import java.util.ArrayList;

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
}
