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

}
