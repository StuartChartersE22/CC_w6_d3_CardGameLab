import java.util.ArrayList;
import java.util.HashMap;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private HashMap<Player, Integer> stats;

    public Game(ArrayList<Player> players){
        this.deck = new Deck();
        this.players = players;
        this.stats = new HashMap<>();
        for(Player player : players){
            this.stats.put(player, 0);
        }
    }

    public int countCardsRemainingInDeck() {
        return this.deck.countCards();
    }

    public void dealToPlayer(Player player) {
        Card card = this.deck.removeCard();
        player.receivesCard(card);
    }

    public int determineValueOfHand(Hand hand){
        int total = 0;
        for(Card card : hand.showCards()){
           total += card.getRankValue();
        }
        return total;
    }

    public void startNewGame(){
        this.deck.shuffle();
        for(Player player : players){
            Card card = deck.removeCard();
            player.receivesCard(card);
        }

    }

    public Player determineWinner() {
        Player winner = null;
        int winningTotal = 0;
        for(Player player : players){
            Hand hand = player.getHand();
            int handTotal = determineValueOfHand(hand);
            if(winningTotal < handTotal){
                winner = player;
                winningTotal = handTotal;
            }else if(winningTotal == handTotal){

            }
        }
        addWin(winner);
        return winner;
    }

    private void addWin(Player player){
        int wins = stats.get(player);
        wins += 1;
        stats.put(player,wins);
    }

    public int getWinsForPlayer(Player player){
        return stats.get(player);
    }

    public Player playAGame(){
        startNewGame();
        return determineWinner();
    }
}
