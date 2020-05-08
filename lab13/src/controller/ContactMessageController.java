package controller;

import service.ContactMessageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "MessagesPageController", urlPatterns = {"/contact-message"})
public class ContactMessageController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private int hitCount;

    private ContactMessageService contactMessageService;

    public ContactMessageController() {
        this.contactMessageService = new ContactMessageService();
    }

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

        Optional<String> searchData = Optional.ofNullable(request.getParameter("searchItem"));

        if (searchData.isPresent() && !searchData.get().isEmpty()) {
            request.setAttribute("messages", contactMessageService.filterMessages(searchData.get()));
        } else {
            request.setAttribute("messages", contactMessageService.getContactMessagesSorted());
        }

        request.setAttribute("currentPage", "contact-message");
        request.getRequestDispatcher("/WEB-INF/views/contact-message.jsp").forward(request, response);
    }
}