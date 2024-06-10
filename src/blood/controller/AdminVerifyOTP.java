package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blood.db.Admin;
import blood.db.Users;
import blood.model.AdminDao;
import blood.model.UsersDao;
import blood.service.SendPassword;

/**
 * Servlet implementation class VerifyOTP
 */
@WebServlet("/blood.controller.AdminVerifyOTP")
public class AdminVerifyOTP extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String emailid = request.getParameter("emailid");
		String otp = request.getParameter("otp");
		System.out.println(otp);
		
		Admin a = AdminDao.getOtpAndPassword(emailid);
		if(a.getOtp().equals(otp))
		{
			SendPassword.sendAdminPassword(a,emailid);
			response.sendRedirect("adminLogin.jsp?msg=Password sent to Mail id&ststus=1");
		}
		else
			response.sendRedirect("adminVerify.jsp?msg=Invalid OTP");
	}

}
