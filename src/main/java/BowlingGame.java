import java.util.Arrays;

public class BowlingGame {
    public int getScore(String[] hitPin) {
        int score = 0;
        for (int i = 0; i < hitPin.length; ++i) {
            String hitFrme = hitPin[i];
            String[] oneTimeHit = hitFrme.split("/");
            int first = Integer.parseInt(oneTimeHit[0]);
            int second = Integer.parseInt(oneTimeHit[1]);
            score = score + first + second;
        }
        return score;
    }
}
