import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class LoginServlet extends HttpServlet {
 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String name = request.getParameter("name");
        String password = request.getParameter("password");
 
        String html = null;
 
        if ("admin".equals(name) && "123".equals(password))
            //·þÎñ¶ËÌø×ªrequest.getRequestDispatcher("success.html").forward(request,response);
        	response.sendRedirect("success.html");
        else
            //request.getRequestDispatcher("fail.html").forward(request, response);
        	response.sendRedirect("fail.html");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();
        pw.println(html);
 
    }
 
}