package blood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blood.db.Feedback;
import blood.model.FeedbackDao;

/**
 * Servlet implementation class ViewFeedback
 */
@WebServlet("/blood.controller.UserFeedback")
public class UserFeedback extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Feedback f = new Feedback();
		f.setName(request.getParameter("name"));
		f.setLastname(request.getParameter("lastname"));
		f.setPhone(request.getParameter("phone"));
		f.setEmail(request.getParameter("email"));
		f.setComments(request.getParameter("comments"));
		f.setAnymessage(request.getParameter("anymessage"));

		int status = FeedbackDao.feedback(f);
		if (status > 0)
			response.sendRedirect("userWelcome.jsp?msg=Feedback Sent Successfully");
		else
			response.sendRedirect("userFeedback.jsp?msg=Error");
	}

}
