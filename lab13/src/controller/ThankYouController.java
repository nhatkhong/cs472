package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ThankYouController", urlPatterns = {"/thankyou"})
public class ThankYouController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private int hitCount;

    @Override
    public void init() throws ServletException {
        hitCount = 0;
        this.getServletContext().setAttribute("hitCount", hitCount);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        sendResponse(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        sendResponse(request, response);
    }

    private void sendResponse(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.getServletContext().setAttribute("hitCount", ++hitCount);
        request.getRequestDispatcher("/WEB-INF/views/thankyou.jsp").forward(request, response);
    }
}