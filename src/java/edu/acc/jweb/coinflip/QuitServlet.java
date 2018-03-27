package edu.acc.jweb.coinflip;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/quit"})
public class QuitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        CoinFlipGame cfGame = (CoinFlipGame) session.getAttribute("cfGame");
        request.setAttribute("score", cfGame.score);
        session.invalidate();
        getServletContext().getRequestDispatcher("/WEB-INF/views/quit.jsp").forward(request, response);
    }  
}
