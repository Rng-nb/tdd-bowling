import java.util.Arrays;

public class BowlingGame {
    public int getScore(String[] hitPin) {
        int score = 0;
        for (int i = 0; i < 10; ++i) {
            String oneFrameHit = hitPin[i];
            String[] oneTimeHit = oneFrameHit.split("/");
            if(!isStrike(oneTimeHit[0]) && !isSpare(oneTimeHit[1])) {
                score += getOneTimeScore(oneTimeHit);
            } else if(isStrike(oneTimeHit[0])) {
                oneTimeHit = hitPin[i + 1].split("/");
                if (isStrike(oneTimeHit[0])) {
                    score = score + 20 + getOneScore(hitPin[i + 2].split("/"));
                } else {
                    score = score + 10 + getOneTimeScore(oneTimeHit);
                }
            } else {
                score = score + 10 + getOneScore(hitPin[i + 1].split("/"));
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

    private boolean isSpare(String hit) {
        if(hit.equals("Spare"))
            return true;
        else
            return false;
    }

    private int getOneTimeScore(String[] oneTimeHit) {
        if(isSpare(oneTimeHit[1]))
            return 10;
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
