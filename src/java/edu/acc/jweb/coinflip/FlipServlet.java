package edu.acc.jweb.coinflip;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/flip"})
public class FlipServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String guess;

        guess = (String) request.getParameter("guess");

        HttpSession session = request.getSession();
        CoinFlipGame cfGame = (CoinFlipGame) session.getAttribute("cfGame");
        if (cfGame == null) {
            cfGame = new CoinFlipGame();
            session.setAttribute("cfGame", cfGame);
        }
        
        cfGame.playGame(guess);
        request.setAttribute("wins", cfGame.wins);
        request.setAttribute("losses", cfGame.losses);
        request.setAttribute("lastGuess", cfGame.lastGuess);
        request.setAttribute("lastFlip", cfGame.lastFlip);
        request.setAttribute("lastResult", cfGame.lastResult);
        request.setAttribute("score", cfGame.score);
        getServletContext().getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);
    }

}
