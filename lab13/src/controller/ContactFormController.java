package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContactFormController", urlPatterns = {"/contact-form"})
public class ContactFormController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private int hitCount;

    @Override
    public void init() throws ServletException {
        hitCount = 0;
        this.getServletContext().setAttribute("hitCount", hitCount);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().setAttribute("hitCount", ++hitCount);
        request.setAttribute("currentPage", "contact-form");
        request.getRequestDispatcher("/WEB-INF/views/contact-form.jsp").forward(request, response);
    }
}
