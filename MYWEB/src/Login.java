import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	private String user=null;
	private String password=null;
	public void init(ServletConfig config)
	{
		user=config.getInitParameter("user");
		password=config.getInitParameter("password");
	}
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String user1=request.getParameter("user");
		String password1=request.getParameter("password");
		if(user1.equals(user)&&password1.equals(password))
		{
			response.getWriter().write("Hello:"+user1);
		}
		else
			response.getWriter().write("Sorry:"+user1);
	}
}
