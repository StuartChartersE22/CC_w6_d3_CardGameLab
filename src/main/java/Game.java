public class Game {

    private Deck deck;

    public Game(){
        this.deck = new Deck();
    }

    public int countCardsRemainingInDeck() {
        return this.deck.countCards();
    }

    public void dealToPlayer(Player player) {
        Card card = this.deck.removeCard();
        player.receivesCard(card);
    }
}
