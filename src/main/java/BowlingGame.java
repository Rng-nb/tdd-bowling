import java.util.Arrays;

public class BowlingGame {
    public int getScore(String[] hitPin) {
        int score = 0;
        for (int i = 0; i < 10; ++i) {
            String oneFrameHit = hitPin[i];
            String[] oneTimeHit = oneFrameHit.split("/");
            if(!oneTimeHit[0].equals("Strike") && !oneTimeHit[1].equals("Strike")) {
                int first = Integer.parseInt(oneTimeHit[0]);
                int second = Integer.parseInt(oneTimeHit[1]);
                score = score + first + second;
            } else {
                String nextHit = hitPin[i + 1];
                score = score + 10 + getScore(new String[] {nextHit});
            }
        }
        return score;
    }
}
