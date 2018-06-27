import java.util.ArrayList;
import java.util.HashMap;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(ArrayList<Player> players){
        this.deck = new Deck();
        this.players = players;
    }

    public int countCardsRemainingInDeck() {
        return this.deck.countCards();
    }

    public void dealToPlayer(Player player) {
        Card card = this.deck.removeCard();
        player.receivesCard(card);
    }

    public int determineValueOfHand(ArrayList<Card> hand){
        int total = 0;
        for(Card card : hand){
           total += card.getRankValue();
        }
        return total;
    }

    public Player determineWinner() {
        Player winner = null;
        int winningTotal = 0;
        for(Player player : players){
            ArrayList<Card> hand = player.getHand();
            int handTotal = determineValueOfHand(hand);
            if(winningTotal < handTotal){
                winner = player;
                winningTotal = handTotal;
            }
        }
        return winner;
    }
}
