package edu.acc.jweb.coinflip;

public class CoinFlipGame {
    public int wins;
    public int losses;
    public String lastGuess;
    public String lastFlip;
    public String lastResult;
    
    CoinFlipGame() {
        newGame();
    }
    
    public void newGame() {
        this.wins = 0;
        this.losses = 0;
    }
    
    public void playGame (String guess) {
        //double index =  0.9;
        double index =  Math.random();
        String flip;
        if (index < 0.5) {
            flip = "HEADS";
        }
        else {
            flip = "TAILS";
        }
        this.lastGuess = guess;
        this.lastFlip = flip;
        if (flip.equals(guess)) {
            this.wins++;
            this.lastResult = "win";
        }
        else {
            this.losses++;
            this.lastResult = "lose";
        }
    }
}
