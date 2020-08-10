import java.util.Arrays;

public class BowlingGame {

    private int [] rolls;
    private int rollsCount;

    public BowlingGame() {
    }

    public int getScore(int... rolls){

        this.rolls = rolls;
        rollsCount = rolls.length;
        return calculateGameScore();
    }

    private int calculateGameScore() {

        int score = 0;
        int frameIndex = 0;

        for (int rollsIndex = 0; rollsIndex < rollsCount;) {

            if (isStrike(rollsIndex)){
                score += 10 + rolls[rollsIndex +1] + rolls[rollsIndex +2];
                frameIndex++;
                rollsIndex++;
            } else if (isSpare(rollsIndex)){
                score += 10 + rolls[rollsIndex +2];
                frameIndex++;
                rollsIndex +=2;
            } else {
                score += rolls[rollsIndex] + rolls[rollsIndex +1];
                frameIndex++;
                rollsIndex +=2;
            }
            if (isLastFrame(frameIndex)){
                return score;
            }
        }
        return score;
    }

    private boolean isLastFrame(int frameIndex) {
        return frameIndex == 10;
    }

    private boolean isSpare(int rollsIndex) {
        return (rolls[rollsIndex] + rolls[rollsIndex + 1]) == 10;
    }

    private boolean isStrike(int roll){
        return rolls[roll] == 10;
    }

}
