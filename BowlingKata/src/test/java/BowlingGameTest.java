import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    BowlingGame game;

    @Test
    void shouldReturnScore4SimpleRollSequence() {
        //given

        //when
        int score = game.getScore(2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2);

        //then
        assertEquals(score, 40);
    }

    @Test
    void shouldReturnScoreWhenSpareHappensDuringTheGame() {
        //given

        //when
        int score = game.getScore(5,5,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2);

        //then
        assertEquals(score, 48);
    }

    @Test
    void shouldReturnScoreWhenSpareHappensAtTheEndOfTheGame() {
        //given

        //when
        int score = game.getScore(2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,5,5,7);

        //then
        assertEquals(score, 53);
    }

    @Test
    void shouldReturnScoreWhenStrikeHappensDuringTheGame() {
        //given

        //when
        int score = game.getScore(10,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2);

        //then
        assertEquals(score, 50);
    }

    @BeforeEach
    void setUp() {
        game = new BowlingGame();
    }
}
