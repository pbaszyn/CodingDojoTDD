import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    @Test
    void shouldReturnSomePoints() {
        //given
        BowlingGame game = new BowlingGame();

        //when
        int score = game.getScore();


        //then
        Assertions.assertEquals(score, 0);
    }
}
