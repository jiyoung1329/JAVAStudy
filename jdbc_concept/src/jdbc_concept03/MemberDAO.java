package jdbc_concept03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MemberDAO {
	
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "oracle";
	private String upw = "oracle"; 
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int MemberCreate(String email, String name, String password) {
		String query = "insert into concept03 values(concept03_seq.nextval, ?, ?, ?)";
		
		int result = 0;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, name);
			ps.setString(3, password);
			
			result = ps.executeUpdate();
			
			
		} catch(Exception e) {
			e.printStackTrace();

		} finally {
			closeServer();
		}
		
		return result;
	}
	
	public MemberDTO MemberSelect(String email) {
		String query = "select * from concept03 where email = ?";
		
		MemberDTO dto = null;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			
			rs = ps.executeQuery();
			if (rs.next()) {
				dto = new MemberDTO(rs.getInt("num"), rs.getString("email"), rs.getString("name"), rs.getString("password"));
			} 

		} catch(Exception e) {
			e.printStackTrace();

		} finally {
			closeServer();
		}
		
		return dto;
	}
	
	public ArrayList<MemberDTO> MemberSelectAll() {
		ArrayList<MemberDTO> members = new ArrayList<MemberDTO>();
		String query = "select * from concept03";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				MemberDTO dto = new MemberDTO(rs.getInt("num"), rs.getString("email"), rs.getString("name"), rs.getString("password")); 
				members.add(dto);
			}
			
		} catch(Exception e) {
			e.printStackTrace();

		} finally {
			closeServer();
		}
		return members;
	}
	
	public int MemberUpdate(String email, String password) {
		String query = "update concept03 set password=? where email=?";
		
		int result = 0;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, password);
			ps.setString(2, email);
			result = ps.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();

		} finally {
			closeServer();
		}
		return result;
	}
	
	public int MemberDelete(String email) {
		String query = "delete from concept03 where email = ?";
		
		int result = 0;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1,  email);
			result = ps.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();

		} finally {
			closeServer();
		}
		
		return result;
	}
	
	public void closeServer() {
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
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
