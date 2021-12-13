package ss8_clean_code_va_refactoring.bai_tap.tennis_game;

import org.jetbrains.annotations.NotNull;

public class TennisGame {
    public static String getScore(String nameOfPlayer1, String nameOfPlayer2, int scoreOfPlayer1, int scoreOfPlayer2) {

        String score = "";
        int tempScore = 0;
        if (isTwoPlayersDraw(scoreOfPlayer1, scoreOfPlayer2)) {
            switch (scoreOfPlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (isPlayer1Win(scoreOfPlayer1) || isPlayer2Win(scoreOfPlayer2)) {
            score = whoPlayerWin(scoreOfPlayer1, scoreOfPlayer2);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = scoreOfPlayer1;
                } else {
                    score += "-";
                    tempScore = scoreOfPlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
    private static boolean isPlayer2Win(int scoreOfPlayer2) {
        return scoreOfPlayer2 >= 4;
    }

    private static boolean isPlayer1Win(int scoreOfPlayer1) {
        return scoreOfPlayer1 >= 4;
    }

    @NotNull
    private static String whoPlayerWin(int scoreOfPlayer1, int scoreOfPlayer2) {
        String score;
        int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
        if (minusResult == 1) {
            score = "Advantage player1";
        }else if (minusResult == -1){
            score = "Advantage player2";
        } else if (isPlayer2Win(minusResult)){
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    private static boolean isTwoPlayersDraw(int scoreOfPlayer1, int scoreOfPlayer2) {
        return scoreOfPlayer1 == scoreOfPlayer2;
    }
}
