<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <head>
        <link rel="stylesheet" href="/CoinFlip/styles/styles.css">
    </head>
    <body>
        
        
        <div>list game results here</div><br>
        
        <div>wins: ${wins}</div><br>
        <div>losses: ${losses}</div><br>
        <div>lastGuess: ${lastGuess}</div><br>
        <div>lastFlip: ${lastFlip}</div><br>
        <div>lastResult: ${lastResult}</div><br>
        
        
        

        Click the button of your choice to guess the next coin flip.<br><br>
        
        <form action="flip" method="post">
            <input type="submit" name="guess" value="HEADS" /><br><br>
            <input type="submit" name="guess" value="TAILS" />
        </form> 
        
        <br><div><a href="/CoinFlip/quit">Quit</a></div><br>
        
    </body>
</html>
