import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    @Test
    void should_return_total_number_when_getscore_given_without_strike_nor_spare_anyFrame() {
        String hitPin[] = {"1/1","1/1","1/1","1/1","1/1","1/1","1/1","1/1","1/1","1/1"};
        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.getScore(hitPin);
        assertEquals(20, score);
    }

    @Test
    void should_return_sum_number_when_getscore_given_with_strike_but_not_continuous() {
        String hitPin[] = {"1/1","1/1","Strike/null","1/1","1/1","Strike/null","1/1","1/1","1/1","1/1"};
        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.getScore(hitPin);
        assertEquals(40, score);
    }

    @Test
    void should_return_sum_number_when_getscore_given_with_strike_cotinuous_except_10thFrame() {
        String hitPin[] = {"1/1","1/1","Strike/null","Strike/null","Strike/null","1/1","1/1","1/1","1/1","1/1"};
        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.getScore(hitPin);
        assertEquals(77, score);
    }

    @Test
    void should_return_sum_number_when_getscore_given_with_stike_and_spare_except_10thFrame() {
        String hitPin[] = {"1/1","1/1","Strike/null","Strike/null","Strike/null","1/Spare","Strike/null","1/1","1/1","1/1"};
        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.getScore(hitPin);
        assertEquals(113, score);
    }

}
