import java.util.Arrays;

public class BowlingGame {
    public int getScore(String[] hitPin) {
        int score = 0;
        for (int i = 0; i < hitPin.length; ++i) {
            String oneFrameHit = hitPin[i];
            String[] oneTimeHit = oneFrameHit.split("/");
            if(!isStrike(oneTimeHit[0]) && !isStrike(oneTimeHit[1])) {
                score = score + getOneTimeScore(oneTimeHit);
            } else {
                String nextHit = hitPin[i + 1];
                oneTimeHit = nextHit.split("/");
                if (isStrike(oneTimeHit[0])) {
                    score = score + 20+ getOneScore(hitPin[i + 2].split("/"));
                } else {
                    score = score + 10 + getOneTimeScore(oneTimeHit);
                }
            }
        }
        return score;
    }

    private boolean isStrike(String hit) {
        if(hit.equals("Strike"))
            return true;
        else
            return false;
    }

    private int getOneTimeScore(String[] oneTimeHit) {
        int first = Integer.parseInt(oneTimeHit[0]);
        int second = Integer.parseInt(oneTimeHit[1]);
        return first + second;
    }

    private int getOneScore(String[] oneTimeHit) {
        if(isStrike(oneTimeHit[0]))
            return 10;
        else
            return Integer.parseInt(oneTimeHit[0]);
    }
}
