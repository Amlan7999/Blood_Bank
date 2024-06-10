package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blood.db.Users;
import blood.model.UsersDao;
import blood.service.SendPassword;

/**
 * Servlet implementation class VerifyOTP
 */
@WebServlet("/blood.controller.VerifyOTP")
public class VerifyOTP extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String emailid = request.getParameter("emailid");
		String otp = request.getParameter("otp");

		Users u = UsersDao.getOtpAndPassword(emailid);
		if (u.getOtp().equals(otp)) {
			SendPassword.sendUsersPassword(u, emailid);
			response.sendRedirect("userLogin.jsp?msg=Password sent to Mail id&status=1");
		} else
			response.sendRedirect("userVerify.jsp?msg=Invalid OTP");
	}

}
