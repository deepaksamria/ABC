import com.firstapp.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ValidateUser")
public class ValidateUser extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		ValidateUserDAO dao = new ValidateUserDAO();
		try {
			if(dao.checkuser(uname, pass))
			{
				HttpSession session = request.getSession();
				session.setAttribute("uname", uname);
				response.sendRedirect("HomePage.jsp");
			}else
			{
				response.sendRedirect("Index.jsp");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
