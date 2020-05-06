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
		String html = "<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n" + 
				"    \r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n" + 
				"    <meta name=\"description\" content=\"\">\r\n" + 
				"    <meta name=\"author\" content=\"Elly Businge\">\r\n" + 
				"	<link type=\"text/css\" rel=\"shortcut icon\" href=\"images/favicon.ico\"/>\r\n" + 
				"\r\n" + 
				"    <title>Lab10 - Part 2</title>\r\n" + 
				"\r\n" + 
				"    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n" + 
				"\r\n" + 
				"    <link href=\"css/custom.css\" rel=\"stylesheet\">\r\n" + 
				"  </head>\r\n" + 
				"\r\n" + 
				"  <body cz-shortcut-listen=\"true\">\r\n" + 
				"\r\n" + 
				"    <nav class=\"navbar navbar-expand-md navbar-dark bg-dark mb-4 nav_style\">\r\n" + 
				"      <a class=\"navbar-brand\" href=\"#\">CS472-WAP ::: Lab10</a>\r\n" + 
				"      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
				"        <span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"      </button>\r\n" +  
				"    </nav>\r\n" + 
				"\r\n" + 
				"    <main role=\"main\" class=\"container\">\r\n" + 
				"		<p class=\"date_style\">" + session.getAttribute("dateToday") + "</p>\r\n" + 
				"		<div class=\"card card_style\">\r\n" + 
				"			<div class=\"card-header\">\r\n" + 
				"				<h4>Thank you! Your message has been received as follows:</h4>\r\n" + 
				"			</div>\r\n" + 
				"			<div class=\"card-body\">\r\n" + 
				"				<h6>Name: " + session.getAttribute("fullName") + "</h6>\r\n" + 
				"				<p>Gender: " + session.getAttribute("gender") + "</p>\r\n" + 
				"				<p>Category: " + session.getAttribute("category") + "</p>\r\n" + 
				"				<p class=\"card-text\">Message: " + session.getAttribute("message") + "</p>\r\n" + 
				"				<p class=\"card-text\">Please feel free to <a href=\"contactUs\">Contact us</a> again</p>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"		\r\n" + 
				"		<div class=\"row\">\r\n" + 
				"			<div class=\"col-md-6\">\r\n" + 
				"							<span>Hit count for the page:</span><span>" + this.getServletContext().getAttribute("hitCount") + "</span>\r\n" + 
				"			</div>\r\n" + 
				"			<div class=\"col-md-6\">\r\n" + 
				"				<span class=\"span_style\">" + request.getServletContext().getAttribute("totalHitCount") +"</span><span class=\"span_style\">Total Hit count for the entire WebApp:</span>\r\n" + 
				"			</div>\r\n" + 
				"		</div>\r\n" + 
				"    </main>\r\n" + 
				"	\r\n" + 
				"	<footer>\r\n" + 
				"        <div>\r\n" + 
				"            <span style=\"margin-left: 1em;\">Elly Businge ::: CS472-WAP</span>\r\n" + 
				"            <span style=\"float: right;margin-right: 1em;\">&copy; May 2020</span>\r\n" + 
				"        </div>\r\n" + 
				"    </footer>\r\n" + 
				"\r\n" + 
				"    <script src=\"js/jquery-3.2.1.slim.min.js.download\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n" + 
				"    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\r\n" + 
				"    <script src=\"js/popper.min.js.download\"></script>\r\n" + 
				"    <script src=\"js/bootstrap.min.js\"></script>\r\n" + 
				"</body></html>";
		response.getWriter().write(html);
	}
}