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
import blood.service.SendPassword;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/blood.controller.AdminForgotPassword")
public class AdminForgotPassword extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailid = request.getParameter("emailid");
		Admin u = new Admin();
		u.setEmailid(emailid);
		
		int status = AdminDao.checkEmailid(u);
		if(status>0)
		{
			String otp = SendPassword.sendAdminOtp(u);
			u.setOtp(otp);
			int result = AdminDao.setOTP(u);
			response.sendRedirect("adminVerify.jsp?emailid="+emailid+"&msg=OTP sent to mail id");
		}
		else
			response.sendRedirect("adminForgotPassword.jsp?msg=Emailid doesnot exists");
	}

	}


