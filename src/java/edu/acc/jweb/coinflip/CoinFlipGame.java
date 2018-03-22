package edu.acc.jweb.coinflip;

public class CoinFlipGame {
    int wins;
    int losses;
    
    CoinFlipGame() {
        newGame();
    }
    
    enum Flip
    {
        HEADS, TAILS;
    }
    
    public void newGame() {
        this.wins = 0;
        this.losses = 0;
    }
    
    public boolean playGame (int guess) {
        int result =  (int) ((int) 2 * Math.random());
        if (result == guess) {
            this.wins++;
        }
        else {
            this.losses++;
        }
        return (result == guess);
    }
}
