<!DOCTYPE html>
<html>
    <head>
        <head>
        <link rel="stylesheet" href="/CoinFlip/styles/styles.css">
    </head>
    <body>
        Welcome to the CoinFlip game!
        Click the button of your choice to guess the next coin flip.
        
        <form action="/main" method="post">
        <input type="submit" name="HEADS" value="HEADS!" />
            <input type="submit" value="Submit">
        </form> 
        
        <p>coinCounter: ${coinCounter}</p>
        <br><div><a href="/CoinFlip/main">Flip</a></div><br>
    </body>
</html>
