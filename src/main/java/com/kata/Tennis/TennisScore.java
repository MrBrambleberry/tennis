package com.kata.Tennis;

public class TennisScore implements TennisScoreCalculator {

    public String score(int player1Points, int player2Points) {

        if (player1Points >= 3 && player2Points >= 3) {
            if (player1Points == player2Points) {
                return TennisScoring.DEUCE.name();
            }

            if (Math.abs(player1Points - player2Points) == 1) {
                return TennisScoring.ADVANTAGE.name();
            }
        }

        return TennisScoring.values()[player1Points] + ":" + TennisScoring.values()[player2Points];
    }
}
