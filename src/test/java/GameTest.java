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
        this.game = new Game(player1, player2);
    }

    @Test
    public void gameHasDeck(){
        assertEquals(52, game.countCardsRemainingInDeck());
    }


}
