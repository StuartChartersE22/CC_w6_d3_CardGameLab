import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.CLUBS, RankType.FOUR);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.CLUBS, card.getSuit());
    }

    @Test

}
