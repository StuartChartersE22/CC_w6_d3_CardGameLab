import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void before() {this.player = new Player();
    this.card = new Card(SuitType.HEARTS, RankType.QUEEN);}

    @Test
    public void playerHasEmptyHand(){
        assertEquals(0, player.countCards());
    }

    @Test
    public void playerReceivesCard(){
        player.receivesCard(card);
        assertEquals(1, player.countCards());
    }

    @Test
    public void canGetPlayersHand(){
        player.receivesCard(card);
        ArrayList<Card> expectedHand = new ArrayList<>();
        expectedHand.add(card);
        assertEquals(expectedHand, player.getHand());
    }

}
