package edu.acc.jweb.coinflip;

public class CoinFlipGame {
    public int wins;
    public int losses;
    public String score;
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
        index = ((double) this.wins/(this.wins + this.losses));
        index = index * 100;
        int ix = (int) index;
        score = String.valueOf(ix) + "%";
    }
}
