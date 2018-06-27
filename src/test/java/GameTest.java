import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Player player1;
    private Player player2;
    private ArrayList<Player> players;

    @Before
    public void before() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.players = new ArrayList<>();
        this.players.add(player1);
        this.players.add(player2);
        this.game = new Game(players);
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

    @Test
    public void canDetermineValueOfHand(){
        game.dealToPlayer(player1);
        assertEquals(1,game.determineValueOfHand(player1.getHand()));
    }

    @Test
    public void canDetermineWinner(){
        game.dealToPlayer(player1);
        game.dealToPlayer(player2);
        assertEquals(player2, game.determineWinner());
    }

}
