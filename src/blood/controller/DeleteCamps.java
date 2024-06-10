package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blood.model.AdminDao;
import blood.model.CampsDao;

/**
 * Servlet implementation class DeleteCamps
 */
@WebServlet("/blood.controller.DeleteCamps")
public class DeleteCamps extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String datetiming = request.getParameter("datetiming");
		int status = CampsDao.deleteCamps(datetiming);
		if (status > 0)
			response.sendRedirect("viewCamps.jsp?msg=deleted");
		else
			response.sendRedirect("viewCamps.jsp?msg=error");
	}

}
