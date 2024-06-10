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
 * Servlet implementation class UserChangePassword
 */
@WebServlet("/blood.controller.UserChangePassword")
public class UserChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String oldpassword = request.getParameter("oldpassword");
		String newpassword = request.getParameter("newpassword");
		String confirmpassword = request.getParameter("confirmpassword");

		HttpSession session = request.getSession();
		String emailid = (String) session.getAttribute("emailid");

		Users u = new Users();
		u.setEmailid(emailid);
		u.setPassword(oldpassword);

		int status = UsersDao.validate(u);
		if (status > 0) {
			if (newpassword.equals(confirmpassword)) {
				u.setPassword(newpassword);
				int result = UsersDao.doChangePassword(u);
				if (result > 0)
					response.sendRedirect("userWelcome.jsp?msg=Password Changed Successfully");
			} else
				response.sendRedirect("userChangePassword.jsp?msg=New Password and Confirm Password mismatch");
		} else
			response.sendRedirect("userChangePassword.jsp?msg=Invalid Old Password");
	}
}
