package blood.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import blood.db.Provider;
import blood.db.Users;
import blood.service.SendPassword;

public class UsersDao {

	public static int register(Users u) {
		int status = 0;
		System.out.println(u.getEmailid() + "-----------------");
		System.out.println(u.getPassword() + "-----------------");
		SendPassword.sendEmailAndPassword(u);

		try {
			Connection con = Provider.getConnection();
			String sql = "insert into users(name,age,dateofbirth,bloodgroup,gender,height,weight,category,maritalstatus,pastmedicalissues,lastdonationdate,contactnumber,emailid,password,photo,address) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setString(2, u.getAge());
			pst.setString(3, u.getDateofbirth());
			pst.setString(4, u.getBloodgroup());
			pst.setString(5, u.getGender());
			pst.setString(6, u.getHeight());
			pst.setString(7, u.getWeight());
			pst.setString(8, u.getCategory());
			pst.setString(9, u.getMaritalstatus());
			pst.setString(10, u.getPastmedicalissues());
			pst.setString(11, u.getLastdonationdate());
			pst.setString(12, u.getContactnumber());
			pst.setString(13, u.getEmailid());
			pst.setString(14, u.getPassword());
			pst.setString(15, u.getPhoto());
			pst.setString(16, u.getAddress());

			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;
	}

	public static int validate(Users u) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "select * from users where emailid=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getEmailid());
			pst.setString(2, u.getPassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next())
				status = 1;

		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;
	}

	public static int doChangePassword(Users u) {

		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "update users set password=? where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getPassword());
			pst.setString(2, u.getEmailid());
			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;

	}

	public static int checkEmailid(Users u) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "select * from users where emailid=?";
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

	public static int setOTP(Users u) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "update users set OTP=? where emailid=?";
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

	public static Users getOtpAndPassword(String emailid) {
		Users u = null;
		try {
			Connection con = Provider.getConnection();
			String sql = "select otp,password from users where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emailid);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				u = new Users();
				u.setOtp(rs.getString(1));
				u.setPassword(rs.getString(2));
			}

		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return u;
	}

	public static ArrayList<Users> fetchUsers() {
		ArrayList<Users> all = new ArrayList<Users>();

		try {
			Connection con = Provider.getConnection();
			String sql = "select * from users";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Users u = new Users();
				u.setPhoto(rs.getString("photo"));
				u.setName(rs.getString("name"));
				u.setEmailid(rs.getString("emailid"));
				u.setContactnumber(rs.getString("contactnumber"));
				all.add(u);
			}

		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return all;
	}

	public static int deleteUser(String emailid) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "delete from users where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, emailid);
			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;
	}

	public static Users getDetails(Users u1) {
		int status = 0;
		try {
			Connection con = Provider.getConnection();
			String sql = "select * from users where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u1.getEmailid());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				u1 = new Users();
				u1.setName(rs.getString("name"));
				u1.setAge(rs.getString("age"));
				u1.setDateofbirth(rs.getString("dateofbirth"));
				u1.setBloodgroup(rs.getString("bloodgroup"));
				u1.setGender(rs.getString("gender"));
				u1.setHeight(rs.getString("height"));
				u1.setWeight(rs.getString("weight"));
				u1.setPatientid(rs.getString("patientid"));
				u1.setCategory(rs.getString("category"));
				u1.setMaritalstatus(rs.getString("maritalstatus"));
				u1.setPastmedicalissues(rs.getString("pastmedicalissues"));
				u1.setLastdonationdate(rs.getString("lastdonationdate"));
				u1.setContactnumber(rs.getString("contactnumber"));
				u1.setEmailid(rs.getString("emailid"));
				u1.setPhoto(rs.getString("photo"));
				u1.setAddress(rs.getString("address"));

			}
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return u1;
	}

	public static int editProfile(Users u) {

		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "update users set name=?,age=?,dateofbirth=?,bloodgroup=?,gender=?,height=?,weight=?,category=?,maritalstatus=?,pastmedicalissues=?,lastdonationdate=?,contactnumber=?,photo=?,address=? where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setString(2, u.getAge());
			pst.setString(3, u.getDateofbirth());
			pst.setString(4, u.getBloodgroup());
			pst.setString(5, u.getGender());
			pst.setString(6, u.getHeight());
			pst.setString(7, u.getWeight());
			pst.setString(8, u.getCategory());
			pst.setString(9, u.getMaritalstatus());
			pst.setString(10, u.getPastmedicalissues());
			pst.setString(11, u.getLastdonationdate());
			pst.setString(12, u.getContactnumber());
			pst.setString(14, u.getAddress());
			pst.setString(13, u.getPhoto());
			pst.setString(15, u.getEmailid());
			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;

	}

	public static int updateId(String emailid, String userId) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "update users set patientid=? where emailid=?";
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, userId);
			pst.setString(2, emailid);
			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;
	}

	public static String getId() {

		String id = null;
		try {

			Connection con = Provider.getConnection();
			String sql = "select lifeline.NEXTVAL from dual";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				id = rs.getString(1);
			}
		}

		catch (Exception e)

		{
			e.printStackTrace();
		}
		return id;

	}

}