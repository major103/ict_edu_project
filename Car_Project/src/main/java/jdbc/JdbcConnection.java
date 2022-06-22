package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@icteducarproject_medium?TNS_ADMIN=/Users/hyeoncheolseo/Downloads/Wallet_icteducarproject";
			String user = "ADMIN";
			String password = "Icteducarproject1";
			con = DriverManager.getConnection(url, user, password);
			
		} catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}