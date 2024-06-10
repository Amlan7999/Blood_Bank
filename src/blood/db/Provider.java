package blood.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Provider {
	public static Connection getConnection() {
		Connection con = null;

		try {
			if (con == null)
				;
			{
				Class.forName("oracle.jdbc.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "blood", "blood");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
