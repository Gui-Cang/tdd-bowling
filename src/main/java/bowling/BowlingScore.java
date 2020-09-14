package bowling;

import java.util.*;

public class BowlingScore {

    public static int caculateReultScore(int[][] scoreOfEachFrame) {
        int resultScoreBeforeTenth = 0;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            if (scoreOfEachFrame[i][0] == 10 && scoreOfEachFrame[i + 1][0] == 10) {
                resultScoreBeforeTenth += scoreOfEachFrame[i][0] + scoreOfEachFrame[i + 1][0] + scoreOfEachFrame[i + 2][0];
            }
            if (scoreOfEachFrame[i][0] == 10 && scoreOfEachFrame[i + 1][0] < 10) {
                resultScoreBeforeTenth += scoreOfEachFrame[i][0] + scoreOfEachFrame[i + 1][0] + scoreOfEachFrame[i + 1][1];
            }
            if (scoreOfEachFrame[i][0] < 10 && (scoreOfEachFrame[i][0] + scoreOfEachFrame[i][1] == 10)) {
                resultScoreBeforeTenth += scoreOfEachFrame[i][0] + scoreOfEachFrame[i][1] + scoreOfEachFrame[i + 1][0];
            }
            if (scoreOfEachFrame[i][0] < 10 && (scoreOfEachFrame[i][0] + scoreOfEachFrame[i][1] < 10)) {
                resultScoreBeforeTenth += scoreOfEachFrame[i][0] + scoreOfEachFrame[i][1];
            }
        }
        if (scoreOfEachFrame[9][0] == 10 && scoreOfEachFrame[10][0] == 10) {
            sum = resultScoreBeforeTenth + scoreOfEachFrame[9][0] + scoreOfEachFrame[10][0] + scoreOfEachFrame[11][0];
        }
        if (scoreOfEachFrame[9][0] == 10 && scoreOfEachFrame[10][0] < 10) {
            sum = resultScoreBeforeTenth + scoreOfEachFrame[9][0] + scoreOfEachFrame[10][0] + scoreOfEachFrame[10][1];
        }
        if (scoreOfEachFrame[9][0] < 10 && (scoreOfEachFrame[9][0] + scoreOfEachFrame[9][1] == 10)) {
            sum = resultScoreBeforeTenth + scoreOfEachFrame[9][0] + scoreOfEachFrame[9][1] + scoreOfEachFrame[10][0];
        }
        if (scoreOfEachFrame[9][0] < 10 && (scoreOfEachFrame[9][0] + scoreOfEachFrame[9][1] < 10)) {
            sum = resultScoreBeforeTenth + scoreOfEachFrame[9][0] + scoreOfEachFrame[9][1];
        }
        return sum;
    }

}
