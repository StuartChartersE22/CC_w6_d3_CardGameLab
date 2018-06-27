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
}
