

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.firstapp.DeleteUserDAO;


@WebServlet("/deleteUser")
public class DeleteUser extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int uid=Integer.parseInt(request.getParameter("uid"));
		DeleteUserDAO ddao=new DeleteUserDAO();
		try {
			if(ddao.deleteuser(uid))
			{
				response.sendRedirect("userdeletetd.jsp");
			}
			else
			{
				response.sendRedirect("HomePage.jsp");
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
