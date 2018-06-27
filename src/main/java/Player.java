import java.util.ArrayList;

public class Player {

    private Hand hand;

    public Player(){
        this.hand = new Hand();
    }

    public int countCards() {
        return hand.countCards();
    }

    public void receivesCard(Card card) {
        this.hand.addCard(card);
    }

    public Hand getHand(){
        return this.hand;
    }

}
