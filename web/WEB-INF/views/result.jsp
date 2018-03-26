<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <head>
        <link rel="stylesheet" href="/CoinFlip/styles/styles.css">
    </head>
    <body>
        
        
        
        
        <div>You guessed: ${lastGuess}</div>
        <div>The coin came up: ${lastFlip}</div>
        <div>You ${lastResult}!</div><br>
        
        <div>Your results so far:</div>
        <div>Wins: ${wins}</div>
        <div>Losses: ${losses}</div><br>
        
        <h2>Try again?</h2>
        
        <form action="flip" method="post">
            <div><input type="submit" name="guess" value="HEADS" /></div><br>
            <div><input type="submit" name="guess" value="TAILS" /></div>
        </form>  
        
        <br><br><br><div><a href="/CoinFlip/quit">Quit game</a></div><br>
        
    </body>
</html>
