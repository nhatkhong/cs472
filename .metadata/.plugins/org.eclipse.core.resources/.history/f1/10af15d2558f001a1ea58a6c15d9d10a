package org.miu.Lab10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

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
			
		String html = "<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n" + 
				"    \r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n" + 
				"    <meta name=\"description\" content=\"\">\r\n" + 
				"    <meta name=\"author\" content=\"Elly Businge\">\r\n" + 
				"	<link type=\"text/css\" rel=\"shortcut icon\" href=\"images/favicon.ico\"/>\r\n" + 
				"\r\n" + 
				"    <title>Lab10 - Part 1</title>\r\n" + 
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
				"      <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n" + 
				"        <ul class=\"navbar-nav mr-auto\">\r\n" + 
				"          <li class=\"nav-item active\">\r\n" + 
				"            <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\r\n" + 
				"          </li>\r\n" + 
				"          <li class=\"nav-item\">\r\n" + 
				"            <a class=\"nav-link\" href=\"#\">About</a>\r\n" + 
				"          </li>\r\n" + 
				"          <li class=\"nav-item\">\r\n" + 
				"            <a class=\"nav-link\" href=\"contactUs\">Contact Us</a>\r\n" + 
				"          </li>\r\n" + 
				"        </ul>\r\n" + 
				"        <form class=\"form-inline mt-2 mt-md-0\">\r\n" + 
				"          <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\r\n" + 
				"          <button class=\"btn btn-outline-success my-2 my-sm-0 btn_search\" type=\"submit\">Search</button>\r\n" + 
				"        </form>\r\n" + 
				"      </div>\r\n" + 
				"    </nav>\r\n" + 
				"\r\n" + 
				"    <main role=\"main\" class=\"container\">\r\n" + 
				"      <div class=\"jumbotron\">\r\n" + 
				"        <h1>Hello, world of HttpServlet 4.0!</h1>\r\n" + 
				"		<h4>Welcome to Lab 10</h4>\r\n" + 
				"        <p class=\"lead\">This is a simple hero unit, a simple jumbtron-style component for calling extra attention to featured content or information.</p>\r\n" + 
				"		<hr/>\r\n" + 
				"		<p>It uses utility classes for typography and spacing to space content out within the target container</p>\r\n" + 
				"        <a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">Learn More</a>\r\n" + 
				"      </div>\r\n" + 
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