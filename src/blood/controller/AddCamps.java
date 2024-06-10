package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blood.db.Camps;
import blood.model.AdminDao;
import blood.model.CampsDao;

/**
 * Servlet implementation class AddCamps
 */
@WebServlet("/blood.controller.AddCamps")
public class AddCamps extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Camps c1 = new Camps();
		c1.setName(request.getParameter("name"));
		c1.setAddress(request.getParameter("address"));
		c1.setDatetiming(request.getParameter("datetiming"));

		int status = CampsDao.addcamps(c1);
		if (status > 0)
			response.sendRedirect("adminWelcome.jsp?msg=Camp Added Successfully");
		else
			response.sendRedirect("addCamps.jsp?msg=Error in Adding");

	}

}
