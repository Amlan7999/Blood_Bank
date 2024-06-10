package blood.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import blood.db.Contact;
import blood.db.Provider;
import blood.db.Users;
import blood.service.SendPassword;

public class ContactDao {

	public static int register(Contact c) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "insert into contact(name,email,phone,message) values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, c.getName());
			pst.setString(2, c.getEmail());
			pst.setString(3, c.getPhone());
			pst.setString(4, c.getMessage());

			status = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

	public static ArrayList<Contact> viewContact() {
		ArrayList<Contact> all = new ArrayList<Contact>();

		try {
			Connection con = Provider.getConnection();
			String sql = "select * from contact";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Contact c = new Contact();
				c.setName(rs.getString("name"));
				c.setEmail(rs.getString("email"));
				c.setPhone(rs.getString("phone"));
				c.setMessage(rs.getString("message"));

				all.add(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return all;
	}

}
