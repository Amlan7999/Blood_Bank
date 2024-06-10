package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import blood.db.Admin;
import blood.model.AdminDao;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/blood.controller.AdminLogin")
public class AdminLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		
		Admin a = new Admin();
		a.setEmailid(emailid);
		a.setPassword(password);
		
		int status = AdminDao.validate(a);
		if(status>0)
		{
			HttpSession session=request.getSession();
			session.setAttribute("emailid",emailid);
			response.sendRedirect("adminWelcome.jsp?msg=Login Successful");
		}
		else
			response.sendRedirect("adminLogin.jsp?msg=Invalid Emailid or Password&status=0");
	}

}
