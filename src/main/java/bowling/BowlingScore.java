package bowling;

import java.util.*;

public class BowlingScore {

    public static int caculateReultScore(int[] scoreOfEachFrame) {
        int reultScore = 0;
        for (int i = 0; i < scoreOfEachFrame.length - 2; i++) {
            reultScore += scoreOfEachFrame[i] + scoreOfEachFrame[i + 1] + scoreOfEachFrame[i + 2];
        }
        return reultScore;
    }
}
