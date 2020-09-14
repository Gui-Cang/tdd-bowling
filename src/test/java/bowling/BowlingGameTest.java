package bowling;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BowlingGameTest {


    @Test
    void should_get_full_score_when_get_all_strike() {
        int[] scoreOfEachFrame = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int resultSore = BowlingScore.caculateReultScore(scoreOfEachFrame);
        assertEquals(300, resultSore);
    }

    @Test
    void should_get_zero_score_when_lose_all_frame() {
        int[] scoreOfEachFrame = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int resultSore = BowlingScore.caculateReultScore(scoreOfEachFrame);
        assertEquals(0, resultSore);
    }

    @Test
    void should_get_appropriate_sum_score_when_caculate_given_spare() {
        int[] scoreOfEachFrame = {10, 10, 10, 10, 10, 10, 10, 10, 10, 8, 2, 10};
        int resultSore = BowlingScore.caculateReultScore(scoreOfEachFrame);
        assertEquals(278, resultSore);
    }

    @Test
    void should_get_appropriate_sum_score_when_caculate_given_no_strike_nor_spare() {
        int[] scoreOfEachFrame = {10, 10, 10, 10, 10, 10, 10, 10, 10, 8, 1};
        int resultSore = BowlingScore.caculateReultScore(scoreOfEachFrame);
        assertEquals(257, resultSore);
    }
}
