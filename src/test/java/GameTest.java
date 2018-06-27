import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Player player1;
    private Player player2;

    @Before
    public void before() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.game = new Game();
    }

    @Test
    public void gameHasDeck(){
        assertEquals(52, game.countCardsRemainingInDeck());
    }

    @Test
    public void canDealCardToPlayer(){
        game.dealToPlayer(player1);
        game.dealToPlayer(player2);
        assertEquals(50, game.countCardsRemainingInDeck());
        assertEquals(1, player1.countCards());
        assertEquals(1, player2.countCards());

    }

}
