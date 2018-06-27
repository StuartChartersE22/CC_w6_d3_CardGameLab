import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<>();
    }

    public int countCards() {
        return this.hand.size();
    }

    public void receivesCard(Card card) {
        this.hand.add(card);
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }

}
