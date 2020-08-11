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
        assertEquals(score, 40);
    }

    @Test
    void shouldReturnScoreWhenSpareHappensDuringTheGame() {
        //given

        //when
        int score = game.getScore(5, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);

        //then
        assertEquals(score, 48);
    }

    @Test
    void shouldReturnScoreWhenSpareHappensAtTheEndOfTheGame() {
        //given

        //when
        int score = game.getScore(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 7);

        //then
        assertEquals(score, 53);
    }

    @Test
    void shouldReturnScoreWhenStrikeHappensDuringTheGame() {
        //given

        //when
        int score = game.getScore(10, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);

        //then
        assertEquals(score, 50);
    }

    @Test
    void shouldReturnScoreWhenStrikeHappensAtTheEndOfTheGame() {
        //given

        //when
        int score = game.getScore(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 4);

        //then
        assertEquals(score, 53);
    }

    @BeforeMethod
    void setUp() {
        game = new BowlingGame();
    }
}
