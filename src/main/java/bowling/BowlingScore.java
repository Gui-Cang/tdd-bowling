import java.util.*;

public class BowlingScore {
    int reultScore = 0;

    public int caculateReultScore( int[] scoreOfEachFrame) {
        TreeMap<Integer, Integer> treeMapOfEachScore = new TreeMap<Integer, Integer>();
        for (int i = 0; i < scoreOfEachFrame.length; i++) {
            treeMapOfEachScore.put(i,scoreOfEachFrame[i]);
        }
        for (int i = 0; i < 10; i++) {
            reultScore = scoreOfEachFrame[i] + scoreOfEachFrame[i+1] + scoreOfEachFrame[i+1];
        }

        return reultScore;
    }
}
