

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.firstapp.addCandidateDAO;


@WebServlet("/AddUserServ")
public class AddUserServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String ncan=request.getParameter("ncan");
		String mob=request.getParameter("mob");
		String email=request.getParameter("email");
		String city=request.getParameter("city");
				
		addCandidateDAO adao=new addCandidateDAO();
		try {
			if(adao.addCandidate(ncan, mob, email, city))
			{
			out.println("Candidate added sucessfully");
			response.sendRedirect("candidateadded.jsp");
			}
			else
			{
				out.println("Candidate not added please try after sometime");
				response.sendRedirect("HomePage.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

	

}
