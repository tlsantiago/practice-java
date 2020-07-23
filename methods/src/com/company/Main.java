package com.company;

public class Main {

    public static void main(String[] args) {
	    int highScore = calculateScore (true, 800, 5, 100);
        System.out.println(highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Santiago", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Santiago", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Santiago", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Santiago", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }

        //-------------Calling challenge methods--------------//


    }


    //---------------Challenge--------------//


    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position "
                + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500) {
            return 2;
        } else if(playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
