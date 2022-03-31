package sceneBuilderEvent6.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;


public class LoginDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "oracle";
	private String upw = "oracle";
	
	
	public Connection getConn() throws SQLException {
		return conn;
	}


	public String getUrl() {
		return url;
	}


	public String getUid() {
		return uid;
	}


	public String getUpw() {
		return upw;
	}


	public LoginDAO() {
		conn = null;
		ps = null;
		rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public LoginDTO selectId(String id) {
		String query = "select * from fx_concept where id = ?";
		LoginDTO login = null;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				login = new LoginDTO();
				login.setId(rs.getString("id"));
				login.setPw(rs.getString("pw"));
				login.setName(rs.getString("name"));
				login.setGender(rs.getString("gender"));
				login.setAge(rs.getString("age"));
				login.setHobbys(rs.getString("hobby"));
			}
			
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			exit();
		}
		
		return login;
	}

	private void exit() {
		try {
			if (rs != null) {
				rs.close();
			}

			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
