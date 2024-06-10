package blood.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import blood.db.Camps;
import blood.db.Doctors;
import blood.db.Provider;

public class DoctorsDao {

	public static int addDoctors(Doctors d) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "insert into doctors(name,emailid,contactnumber,qualification,age,gender,address,photo) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, d.getName());
			pst.setString(2, d.getEmail());
			pst.setString(3, d.getContactnumber());
			pst.setString(4, d.getQualification());
			pst.setString(5, d.getAge());
			pst.setString(6, d.getAge());
			pst.setString(7, d.getAddress());
			pst.setString(8, d.getPhoto());
			status = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

	public static ArrayList<Doctors> fetchDoctors() {
		ArrayList<Doctors> all = new ArrayList<Doctors>();

		try {
			Connection con = Provider.getConnection();
			String sql = "select * from doctors";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Doctors d = new Doctors();
				d.setPhoto(rs.getString("photo"));
				d.setName(rs.getString("name"));
				d.setContactnumber(rs.getString("contactnumber"));
				d.setQualification(rs.getString("qualification"));
				d.setAddress(rs.getString("address"));

				all.add(d);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return all;
	}

	public static int deleteDoctors(String contactnumber) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "delete from doctors where contactnumber=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, contactnumber);
			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;
	}

	public static int register(Doctors d) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "insert into doctors(name,email,contactnumber,qualification,age,gender,address,photo) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, d.getName());
			pst.setString(2, d.getEmail());
			pst.setString(3, d.getContactnumber());
			pst.setString(4, d.getQualification());
			pst.setString(5, d.getAge());
			pst.setString(6, d.getGender());
			pst.setString(7, d.getAddress());
			pst.setString(8, d.getPhoto());

			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;

	}
}
