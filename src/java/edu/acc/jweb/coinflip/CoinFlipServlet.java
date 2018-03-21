package edu.acc.jweb.coinflip;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CoinFlipServlet", urlPatterns = {"/main"})
public class CoinFlipServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);
        Integer coinCounter = (Integer) session.getAttribute("coinCounter");
        if (coinCounter == null) {
            coinCounter = 1;
        } else {
            coinCounter = coinCounter + 1;
        } 
        session.setAttribute("coinCounter", coinCounter);
        getServletContext().getRequestDispatcher("/WEB-INF/views/coinflip.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    
    
    
}
