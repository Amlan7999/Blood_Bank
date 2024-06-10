package blood.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import blood.db.Blood;
import blood.db.Camps;
import blood.db.Provider;

public class CampsDao {

	public static int addcamps(Camps c1) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "insert into camps(name,address,datetiming) values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, c1.getName());
			pst.setString(2, c1.getAddress());
			pst.setString(3, c1.getDatetiming());

			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;

	}

	public static ArrayList<Camps> fetchCamps() {
		ArrayList<Camps> all = new ArrayList<Camps>();

		try {
			Connection con = Provider.getConnection();
			String sql = "select * from Camps";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Camps c1 = new Camps();
				c1.setName(rs.getString("name"));
				c1.setAddress(rs.getString("address"));
				c1.setDatetiming(rs.getString("datetiming"));
				all.add(c1);
			}

		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return all;

	}

	public static int deleteCamps(String datetiming) {
		int status = 0;

		try {
			Connection con = Provider.getConnection();
			String sql = "delete from camps where datetiming=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, datetiming);
			status = pst.executeUpdate();
		} catch (Exception e)

		{
			e.printStackTrace();
		}
		return status;
	}

}
