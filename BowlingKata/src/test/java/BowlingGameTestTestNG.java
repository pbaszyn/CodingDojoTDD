import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BowlingGameTestTestNG {

    BowlingGame game;

    @Test
    void shouldReturnScore4SimpleRollSequence() {
        //given

        //when
        int score = game.getScore(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);

        //then
        assertEquals(40, score);
    }

    @Test
    void shouldReturnScoreWhenSpareHappensDuringTheGame() {
        //given

        //when
        int score = game.getScore(5, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);

        //then
        assertEquals(48, score);
    }

    @Test
    void shouldReturnScoreWhenSpareHappensAtTheEndOfTheGame() {
        //given

        //when
        int score = game.getScore(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 7);

        //then
        assertEquals(53, score);
    }

    @Test
    void shouldReturnScoreWhenStrikeHappensDuringTheGame() {
        //given

        //when
        int score = game.getScore(10, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);

        //then
        assertEquals(50, score);
    }

    @Test
    void shouldReturnScoreWhenStrikeHappensAtTheEndOfTheGame() {
        //given

        //when
        int score = game.getScore(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 4);

        //then
        assertEquals(53, score);
    }

    @BeforeMethod
    void setUp() {
        game = new BowlingGame();
    }
}
