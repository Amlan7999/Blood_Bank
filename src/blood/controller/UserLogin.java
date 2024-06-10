package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import blood.db.Admin;
import blood.db.Users;
import blood.model.AdminDao;
import blood.model.UsersDao;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/blood.controller.UserLogin")
public class UserLogin extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");

		Users u = new Users();
		u.setEmailid(emailid);
		u.setPassword(password);

		int status = UsersDao.validate(u);
		if (status > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("emailid", emailid);
			response.sendRedirect("userWelcome.jsp?msg=Login Successful");
		} else
			response.sendRedirect("userLogin.jsp?msg=Invalid Emailid or Password&status=0");
	}

}
