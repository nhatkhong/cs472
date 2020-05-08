
package service;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(dispatcherTypes = {
        DispatcherType.REQUEST, DispatcherType.FORWARD
}, description = "Counts the number of times pages have been accessed in the web application", urlPatterns = {"/", "/*"})
public class PageAccessCounter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        ServletContext context = request.getServletContext();
        int totalHitCount = (Integer)context.getAttribute("totalHitCount");
        totalHitCount++;
        System.out.println("Web page counter has been incremented to " + totalHitCount);
        context.setAttribute("totalHitCount", totalHitCount);
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        int totalHitCount = 0;
        System.out.println("Initializing the web page(s) counter to Zero !!!");
        config.getServletContext().setAttribute("totalHitCount", totalHitCount);
    }
}