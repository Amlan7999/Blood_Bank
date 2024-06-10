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

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import blood.db.Camps;
import blood.db.Doctors;
import blood.db.Users;
import blood.model.CampsDao;
import blood.model.DoctorsDao;
import blood.model.UsersDao;

/**
 * Servlet implementation class AddDoctors
 */
@WebServlet("/blood.controller.AddDoctors")
public class AddDoctors extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		Doctors d = new Doctors();
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
					if (c == 8)
						d.setPhoto(photo_name);
					System.out.println(photo_name + "   " + c);
				} else {
					c++;
					String value = fileItem.getString();

					if (c == 1)
						d.setName(value);
					if (c == 2)
						d.setEmail(value);
					if (c == 3)
						d.setContactnumber(value);
					if (c == 4)
						d.setQualification(value);
					if (c == 5)
						d.setAge(value);
					if (c == 6)
						d.setGender(value);
					if (c == 7)
						d.setAddress(value);

					System.out.println(c + "=========" + value);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			out.write("Exception in uploading file.");
		}
		out.write("</body></html>");

		int status = DoctorsDao.register(d);
		if (status > 0) {

			response.sendRedirect("adminWelcome.jsp?msg=Doctor successfully added");

		} else
			response.sendRedirect("addDoctors.jsp?msg=Error in adding");

	}

}
