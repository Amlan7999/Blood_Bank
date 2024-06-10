package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blood.db.Contact;
import blood.db.Users;
import blood.model.ContactDao;
import blood.model.UsersDao;

/**
 * Servlet implementation class ContactDetails
 */
@WebServlet("/blood.controller.ContactDetails")
public class ContactDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String message = request.getParameter("message");

		Contact c = new Contact();
		c.setEmail(email);
		c.setPhone(phone);
		c.setName(name);
		c.setMessage(message);

		int status = ContactDao.register(c);
		if (status > 0)
			response.sendRedirect("index.jsp?msg=Contact send...");
		else
			response.sendRedirect("index.jsp?msg=Error");

	}

}
