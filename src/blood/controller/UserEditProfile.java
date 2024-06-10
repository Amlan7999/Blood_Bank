package blood.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import blood.db.Users;
import blood.model.UsersDao;

/**
 * Servlet implementation class UserEditProfile
 */
@WebServlet("/blood.controller.UserEditProfile")
public class UserEditProfile extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		Users u = new Users();
		String photo_name = null;
		String p1 = null;

		DiskFileItemFactory fileFactory = new DiskFileItemFactory();
		String ctx = getServletContext().getRealPath("//profileimg");
		System.out.println(ctx);
		File f1 = new File(ctx);
		fileFactory.setRepository(f1);// Returns the directory used to temporarily store files that are larger than
										// the configured size threshold.
		ServletFileUpload uploader = new ServletFileUpload(fileFactory);// This class handles multiple files per single
																		// HTML widget, sent using multipart/mixed
																		// encoding type, Use
																		// parseRequest(HttpServletRequest) to acquire a
																		// list of FileItems associated with a given
																		// HTML widget.

		int c = 0;
		try {
			List<FileItem> fileItemsList = uploader.parseRequest(request);
			Iterator<FileItem> fileItemsIterator = fileItemsList.iterator();
			while (fileItemsIterator.hasNext()) {

				FileItem fileItem = fileItemsIterator.next();
				if (!fileItem.isFormField()) {
					c++;
					System.out.println("HELLO " + c);
					f1 = new File(ctx + "\\" + fileItem.getName());
					System.out.println(f1.getAbsolutePath() + "-----Sujit");
					fileItem.write(f1);
					out.write("File " + fileItem.getName() + " uploaded successfully.");
					out.write("<br>");
					p1 = "profileimg\\" + f1.getName();
					System.out.println(p1 + "-----LIT");
					System.out.println("-------------------------------------------------------------" + p1);
					photo_name = f1.getName();
					/*
					 * RequestDispatcher rd =
					 * request.getRequestDispatcher("index.jsp?filename="+p1); rd.include(request,
					 * response); out.println("<img src='"+p1+"' height='300px'/>");
					 */
					if (c == 15)
						u.setPhoto(photo_name);
					System.out.println(photo_name + "   " + c);
				} else {
					c++;
					String value = fileItem.getString();

					if (c == 1)
						u.setName(value);
					if (c == 2)
						u.setEmailid(value);
					if (c == 3)
						u.setAge(value);
					if (c == 4)
						u.setDateofbirth(value);
					if (c == 5)
						u.setBloodgroup(value);
					if (c == 6)
						u.setGender(value);
					if (c == 7)
						u.setHeight(value);
					if (c == 8)
						u.setWeight(value);
					if (c == 9)
						u.setCategory(value);
					if (c == 10)
						u.setMaritalstatus(value);
					if (c == 11)
						u.setPastmedicalissues(value);
					if (c == 12)
						u.setLastdonationdate(value);
					if (c == 13)
						u.setContactnumber(value);
					if (c == 14)
						u.setAddress(value);

					System.out.println(c + "=========" + value);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			out.write("Exception in uploading file.");
		}
		out.write("</body></html>");

		HttpSession session = request.getSession();
		String emailid = (String) session.getAttribute("emailid");
		// u.setEmailid(emailid);
		System.out.println(u.getEmailid() + "-----------------------");

		int status = UsersDao.editProfile(u);
		if (status > 0) {

			response.sendRedirect("userWelcome.jsp?msg=Successfully Edited");

		} else
			response.sendRedirect("userEditProfile.jsp?msg=Something Error");

	}

}
