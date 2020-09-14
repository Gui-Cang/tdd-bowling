package bowling;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void should_get_full_score_when_get_all_strike() {
        String strings = "to int";
        int[] scoreOfEachFrame= {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int resultSore = BowlingScore.caculateReultScore(scoreOfEachFrame);
        assertEquals(300, resultSore);
    }


}
