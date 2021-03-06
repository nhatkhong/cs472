package org.miu.Lab10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/successServlet")
public class SuccessServlet extends HttpServlet {

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

	private void sendResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");

		HttpSession session = request.getSession(true);
		this.getServletContext().setAttribute("hitCount", ++hitCount);
		String html = "";
		response.getWriter().write(html);
	}
}