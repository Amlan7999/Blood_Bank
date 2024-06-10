package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blood.model.UsersDao;

/**
 * Servlet implementation class DeleteUsers
 */
@WebServlet("/blood.controller.DeleteUsers")
public class DeleteUsers extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String emailid = request.getParameter("emailid");

		int status = UsersDao.deleteUser(emailid);
		if (status > 0)
			response.sendRedirect("viewUsers.jsp?msg=deleted");
		else
			response.sendRedirect("viewUsers.jsp?msg=error");
	}

}
