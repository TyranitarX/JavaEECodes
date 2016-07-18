
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet{
	private String message;
	public void init(ServletConfig config)throws ServletException
	{
		message="hello servlet";
		System.out.println(message);
			
	}
	public void doGet(HttpServletRequest requset ,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>"+message+"</h1>");
	}
	public void destory()
	{
		
	}
}
