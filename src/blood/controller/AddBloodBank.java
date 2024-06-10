package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blood.db.Blood;
import blood.model.AdminDao;

/**
 * Servlet implementation class AddBloodBank
 */
@WebServlet("/blood.controller.AddBloodBank")
public class AddBloodBank extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Blood b = new Blood();
		b.setBankname(request.getParameter("bankname"));
		b.setEmail(request.getParameter("emailid"));
		b.setAddress(request.getParameter("address"));
		b.setContact(request.getParameter("contact"));

		int status = AdminDao.addBank(b);
		if (status > 0)
			response.sendRedirect("adminWelcome.jsp?msg=Blood Bank Added Successfully");
		else
			response.sendRedirect("addBloodBank.jsp?msg=Error in Adding");

	}

}
