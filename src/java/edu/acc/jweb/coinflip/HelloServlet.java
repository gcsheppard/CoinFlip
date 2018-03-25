package edu.acc.jweb.coinflip;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"", "/main"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        HttpSession session = request.getSession(true);
        Integer coinCounter = (Integer) session.getAttribute("coinCounter");
        if (coinCounter == null) {
            coinCounter = 1;
        } else {
            coinCounter = coinCounter + 1;
        } 
        session.setAttribute("coinCounter", coinCounter);
        */
        getServletContext().getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response);
    }
}
