package bowling;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BowlingGameTest {

    @Test
    void should_get_full_score_when_get_all_strike() {
        int[][] scoreOfEachFrame = {
                {10, 0}, {10, 0}, {10, 0},
                {10, 0}, {10, 0}, {10, 0},
                {10, 0}, {10, 0}, {10, 0},
                {10, 0}, {10, 0}, {10, 0}
        };
        int resultSore = BowlingScore.caculateReultScore(scoreOfEachFrame);
        assertEquals(300, resultSore);
    }

    @Test
    void should_get_zero_score_when_lose_all_frame() {
        int[][] scoreOfEachFrame = {
                {0, 0}, {0, 0}, {0, 0},
                {0, 0}, {0, 0}, {0, 0},
                {0, 0}, {0, 0}, {0, 0},
                {0, 0}
        };
        int resultSore = BowlingScore.caculateReultScore(scoreOfEachFrame);
        assertEquals(0, resultSore);
    }

    @Test
    void should_get_appropriate_sum_score_when_caculate_given_spare() {
        int[][] scoreOfEachFrame = {
                {10, 0}, {10, 0}, {10, 0},
                {10, 0}, {10, 0}, {10, 0},
                {10, 0}, {10, 0}, {10, 0},
                {8, 2}, {10, 0}
        };
        int resultSore = BowlingScore.caculateReultScore(scoreOfEachFrame);
        assertEquals(278, resultSore);
    }

    @Test
    void should_get_appropriate_sum_score_when_caculate_given_middle_score() {
        int[][] scoreOfEachFrame = {
                {9, 0}, {9, 0}, {9, 0},
                {9, 0}, {9, 0}, {9, 0},
                {9, 0}, {9, 0}, {9, 0},
                {9, 0},
        };
        int resultSore = BowlingScore.caculateReultScore(scoreOfEachFrame);
        assertEquals(90, resultSore);
    }

    @Test
    void should_get_appropriate_sum_score_when_caculate_given_middle_score2() {
        int[][] scoreOfEachFrame = {
                {9, 1}, {9, 0}, {9, 0},
                {10, 0}, {9, 0}, {9, 0},
                {9, 0}, {9, 0}, {9, 0},
                {9, 0},
        };
        int resultSore = BowlingScore.caculateReultScore(scoreOfEachFrame);
        assertEquals(110, resultSore);
    }
}
