package blood.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import blood.db.Contact;
import blood.db.Feedback;
import blood.db.Provider;

public class FeedbackDao {

	public static int feedback(Feedback f) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "insert into feedback(name,lastname,phone,email,comments,anymessage) values(?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, f.getName());
			pst.setString(2, f.getLastname());
			pst.setString(3, f.getPhone());
			pst.setString(4, f.getEmail());
			pst.setString(5, f.getComments());
			pst.setString(6, f.getAnymessage());

			status = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

	public static ArrayList<Feedback> viewFeedback()

	{
		ArrayList<Feedback> all = new ArrayList<Feedback>();

		try {
			Connection con = Provider.getConnection();
			String sql = "select * from feedback";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Feedback f = new Feedback();
				f.setName(rs.getString("name"));
				f.setLastname(rs.getString("lastname"));
				f.setPhone(rs.getString("phone"));
				f.setEmail(rs.getString("email"));
				f.setAnymessage(rs.getString("anymessage"));

				all.add(f);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return all;
	}

}
