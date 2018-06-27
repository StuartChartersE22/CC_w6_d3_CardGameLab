import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        this.deck = new Deck();
    }

    @Test
    public void deckStartsWith52Cards(){
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canRemoveCard(){
        Card removedCard = deck.removeCard();
        assertEquals(51, deck.countCards());
        assertEquals(1, removedCard.getRankValue());
        assertEquals(1, removedCard.getSuitRank());
    }
}
