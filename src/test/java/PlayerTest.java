import org.junit.Before;
import org.junit.Test;

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



}
