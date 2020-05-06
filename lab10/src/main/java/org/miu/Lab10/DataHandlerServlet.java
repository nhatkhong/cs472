package org.miu.Lab10;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/processData")
public class DataHandlerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		Optional<String> fullName = Optional.ofNullable(request.getParameter("fullName"));
		Optional<String> gender = Optional.ofNullable(request.getParameter("radioGender"));
		Optional<String> category = Optional.ofNullable(request.getParameter("category"));
		Optional<String> message = Optional.ofNullable(request.getParameter("message"));
		boolean hasErrors = false;
		
		StringBuilder errorMessages = new StringBuilder ();
		
		if (fullName.isPresent() && !fullName.get().isEmpty()) {} else {
			errorMessages.append("<p class=\"error_msg\">Name is missing.</p>"); 
			hasErrors = true;
		}
		
		if (gender.isPresent() && !gender.get().isEmpty()) {} else {
			errorMessages.append("<p class=\"error_msg\">Gender is missing.</p>"); 
		}
		
		if (category.isPresent() && !category.get().isEmpty()) {} else {
			errorMessages.append("<p class=\"error_msg\">Category is missing.</p>"); 
		}
		
		if (message.isPresent() && !message.get().isEmpty()) {} else {
			errorMessages.append("<p class=\"error_msg\">Message is missing.</p>"); 
		}
		
		if (hasErrors) {
			request.setAttribute("errorMsg", errorMessages.toString());
			request.getRequestDispatcher("contactUs").forward(request, response);
		} else {
			HttpSession session = request.getSession(true);
			session.setAttribute("fullName", fullName.get());
			session.setAttribute("gender", gender.get());
			session.setAttribute("category", category.get());
			session.setAttribute("message", message.get());
			
			Date dateToday = new Date();
			SimpleDateFormat format = new SimpleDateFormat ("EEEE, dd MMM yyyy");
			session.setAttribute("dateToday", format.format(dateToday));
			
			response.sendRedirect("successServlet");
		}
	}
}