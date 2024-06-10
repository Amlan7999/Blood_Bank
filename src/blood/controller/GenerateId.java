package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blood.model.UsersDao;

/**
 * Servlet implementation class GenerateId
 */
@WebServlet("/blood.controller.GenerateId")
public class GenerateId extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		{
			String emailid = request.getParameter("emailid");
			String id = UsersDao.getId();
			System.out.println(id + "----------------------------------");
			String userId = "LL" + id;
			int status = UsersDao.updateId(emailid, userId);
			if (status > 0) {

				response.sendRedirect("viewUsers.jsp?msg=Patientid Generated");

			} else
				response.sendRedirect("viewUsers.jsp?msg=Error in Generating patientId");

		}
	}

}
