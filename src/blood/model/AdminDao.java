package blood.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import blood.db.Admin;
import blood.db.Blood;
import blood.db.Provider;
import blood.db.Users;

public class AdminDao {

	public static int validate(Admin a) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "select * from admin where emailid=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, a.getEmailid());
			pst.setString(2, a.getPassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next())
				status = 1;

		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;
	}

	public static int addBank(Blood b) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "insert into bloodbank(bankname,emailid,address,contact) values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, b.getBankname());
			pst.setString(2, b.getEmail());
			pst.setString(3, b.getAddress());
			pst.setString(4, b.getContact());

			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;
	}

	public static int doChangePassword(Admin a) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "update admin set password=? where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, a.getPassword());
			pst.setString(2, a.getEmailid());
			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;

	}

	public static ArrayList<Blood> fetchBloodBank() {
		ArrayList<Blood> all = new ArrayList<Blood>();

		try {
			Connection con = Provider.getConnection();
			String sql = "select * from BloodBank";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Blood b = new Blood();
				b.setBankname(rs.getString("bankname"));
				b.setEmail(rs.getString("emailid"));
				b.setContact(rs.getString("contact"));
				b.setAddress(rs.getString("address"));
				all.add(b);
			}

		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return all;
	}

	public static int deleteBloodBank(String emailid) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "delete from bloodbank where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emailid);
			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;
	}

	public static int checkEmailid(Admin u) {

		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "select * from admin where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getEmailid());
			ResultSet rs = pst.executeQuery();
			if (rs.next())
				status = 1;

		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;
	}

	public static int setOTP(Admin u) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "update admin set OTP=? where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getOtp());
			pst.setString(2, u.getEmailid());
			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;
	}

	public static Admin getOtpAndPassword(String emailid) {
		Admin a = null;
		try {
			Connection con = Provider.getConnection();
			String sql = "select otp,password from admin where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emailid);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				a = new Admin();
				a.setOtp(rs.getString(1));
				a.setPassword(rs.getString(2));
			}

		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return a;
	}

}
