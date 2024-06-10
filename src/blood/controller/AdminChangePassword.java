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
 * Servlet implementation class AdminChangePassword
 */
@WebServlet("/blood.controller.AdminChangePassword")
public class AdminChangePassword extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		{
			String oldpassword = request.getParameter("oldpassword");
			String newpassword = request.getParameter("newpassword");
			String confirmpassword = request.getParameter("confirmpassword");

			HttpSession session = request.getSession();
			String emailid = (String) session.getAttribute("emailid");

			Admin a = new Admin();
			a.setEmailid(emailid);
			a.setPassword(oldpassword);

			int status = AdminDao.validate(a);
			if (status > 0) {
				if (newpassword.equals(confirmpassword)) {
					a.setPassword(newpassword);
					int result = AdminDao.doChangePassword(a);
					if (result > 0)
						response.sendRedirect("adminWelcome.jsp?msg=Password Changed Successfully");
				} else
					response.sendRedirect("adminChangePassword.jsp?msg=New Password and Confirm Password mismatch");
			} else
				response.sendRedirect("adminChangePassword.jsp?msg=Invalid Old Password");
		}
	}
}
