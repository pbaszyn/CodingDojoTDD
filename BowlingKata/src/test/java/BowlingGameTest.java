import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void shouldReturnScore4OneRoll() {
        //given
        BowlingGame game = new BowlingGame();

        //when
        int score = game.getScore(5);


        //then
        assertEquals(score, 5);
    }
}
