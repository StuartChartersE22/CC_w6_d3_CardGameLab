public class Game {

    private Deck deck;
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.deck = new Deck();
    }

    public int countCardsRemainingInDeck() {
        return this.deck.countCards();
    }
}
