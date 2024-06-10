package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blood.model.AdminDao;
import blood.model.UsersDao;

/**
 * Servlet implementation class DeleteBloodBank
 */
@WebServlet("/blood.controller.DeleteBloodBank")
public class DeleteBloodBank extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String emailid = request.getParameter("emailid");
		int status = AdminDao.deleteBloodBank(emailid);
		if (status > 0)
			response.sendRedirect("viewBloodBank.jsp?msg=deleted");
		else
			response.sendRedirect("viewBloodBank.jsp?msg=error");
	}

}
