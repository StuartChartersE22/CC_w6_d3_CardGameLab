import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> showCards(){
        return this.cards;
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public int countCards() {
        return this.cards.size();
    }
}
