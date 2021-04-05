package com.kata.Tennis;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisScoreTest {

    @ParameterizedTest
    @CsvSource({ "0,0,LOVE:LOVE", "0,3,LOVE:FORTY", "1,0,FIFTEEN:LOVE", "0,1,LOVE:FIFTEEN", "3,3,DEUCE",
            "3,4,ADVANTAGE" })

    public void if_given_these_player_values_the_correct_score_is_returned(int player1Points, int player2Points,
            String expectedScore) {
        TennisScore tennisScore = new TennisScore();

        assertEquals(expectedScore, tennisScore.score(player1Points, player2Points));
    }
}
