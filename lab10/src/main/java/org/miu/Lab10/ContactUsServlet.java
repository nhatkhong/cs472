package org.miu.Lab10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contactUs")
public class ContactUsServlet extends HttpServlet {

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
		this.getServletContext().setAttribute("hitCount", ++hitCount);
		
		String errorMessage = "";
		if (request.getAttribute("errorMsg") != null)
			errorMessage = (String)request.getAttribute("errorMsg");
		
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
				"            <a class=\"nav-link\" href=\"helloServlet\">Home <span class=\"sr-only\">(current)</span></a>\r\n" + 
				"          </li>\r\n" + 
				"          <li class=\"nav-item\">\r\n" + 
				"            <a class=\"nav-link\" href=\"#\">About</a>\r\n" + 
				"          </li>\r\n" + 
				"          <li class=\"nav-item\">\r\n" + 
				"            <a class=\"nav-link\" href=\"#\">Contact Us</a>\r\n" + 
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
				"      <div style=\"padding-top: 1em;\" class=\"container\">\r\n" + 
				"            <h5>Customer Contact Form</h5>\r\n" + 
				"			<div class=\"col-md-12\">\r\n" + errorMessage +
				"			</div>\r\n" + 
				"            <form id=\"contactUsForm\" method=\"post\" action=\"processData\">\r\n" + 
				"                <fieldset>\r\n" + 
				"                    <legend></legend>\r\n" + 
				"                    <div class=\"row\">\r\n" + 
				"                        <div class=\"col-md-12\">\r\n" + 
				"                            <div class=\"form-group\">\r\n" + 
				"                                <label for=\"fullName\">*Name:</label>\r\n" + 
				"                                <input class=\"form-control\" type=\"text\" name=\"fullName\" id=\"fullName\" placeholder=\"Full Name\" autofocus>\r\n" + 
				"                                <small class=\"form-text text-muted\">Enter your fullname</small>\r\n" + 
				"                            </div>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"					\r\n" + 
				"					<div class=\"row\">\r\n" + 
				"                        <div class=\"col-md-12\">\r\n" + 
				"							<label>*Gender:</label><br>\r\n" + 
				"                            <div class=\"form-group\">\r\n" + 
				"                                <div class=\"custom-control custom-radio custom-control-inline\">\r\n" + 
				"                                    <input type=\"radio\" name=\"radioGender\" id=\"radioradioGenderMale\" class=\"custom-control-input\" value=\"Male\">\r\n" + 
				"                                    <label for=\"radioradioGenderMale\" class=\"custom-control-label\">Male</label>\r\n" + 
				"                                </div>\r\n" + 
				"                                <div class=\"custom-control custom-radio custom-control-inline\">\r\n" + 
				"                                    <input type=\"radio\" name=\"radioGender\" id=\"radioradioGenderFemale\" class=\"custom-control-input\" value=\"Female\">\r\n" + 
				"                                    <label for=\"radioradioGenderFemale\" class=\"custom-control-label\">Female</label>\r\n" + 
				"                                </div>\r\n" + 
				"                            </div>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"					\r\n" + 
				"					<div class=\"row\">\r\n" + 
				"                        <div class=\"col-md-12\">\r\n" + 
				"                            <div class=\"form-group\">\r\n" + 
				"                                <label for=\"ddlCategory\">*Category:</label>\r\n" + 
				"                                <select class=\"form-control\" id=\"category\" name=\"category\">\r\n" + 
				"                                    <option value=\"Feedback\">Feedback</option>\r\n" + 
				"                                    <option value=\"Inquiry\">Inquiry</option>\r\n" + 
				"                                    <option value=\"Complaint\">Complaint</option>\r\n" + 
				"                                </select>\r\n" + 
				"                            </div>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"					\r\n" + 
				"                    <div class=\"row\">\r\n" + 
				"                        <div class=\"col-md-12\">\r\n" + 
				"							<div class=\"form-group\">\r\n" + 
				"								<label for=\"message\">*Message:</label>\r\n" + 
				"								<textarea class=\"form-control\" id=\"message\" name=\"message\" rows=\"2\"></textarea>\r\n" + 
				"							</div>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    \r\n" + 
				"                    <div class=\"row\">\r\n" + 
				"						<div class=\"col-md-12\">\r\n" + 
				"							<div style=\"text-align: right;\" class=\"form-group\">\r\n" + 
				"								<button style=\"padding: .5em 4em;\" id=\"btnSubmit\" type=\"submit\" class=\"btn btn-primary btn-inline submit_btn form-control\">Submit</button>\r\n" + 
				"							</div>\r\n" + 
				"						</div>\r\n" + 
				"                    </div>\r\n" + 
				"					\r\n" + 
				"					<div class=\"row\">\r\n" + 
				"						<div class=\"col-md-6\">\r\n" + 
				"							<span>Hit count for the page:</span><span>" + this.getServletContext().getAttribute("hitCount") + "</span>\r\n" + 
				"						</div>\r\n" + 
				"						<div class=\"col-md-6\">\r\n" + 
				"							<span class=\"span_style\">" + request.getServletContext().getAttribute("totalHitCount") + "</span><span class=\"span_style\">Total Hit count for the entire WebApp:</span>\r\n" + 
				"						</div>\r\n" + 
				"					</div>\r\n" + 
				"                </fieldset>\r\n" + 
				"            </form>           \r\n" + 
				"        </div>\r\n" + 
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