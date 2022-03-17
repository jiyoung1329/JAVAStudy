package jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataAll {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 로드 완료");
		} catch (Exception e) {
			System.out.println("드라이브 로드 실패");
		} 
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "oracle";
		String pw = "oracle";
		String query = "select * from test_table";
		
		Connection conn = null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, id, pw);
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			
			System.out.println("id\t password\t name");
			while(rs.next()) {
				System.out.println(rs.getString("id") + "\t " + rs.getString("pw") + "\t\t " + rs.getString("name"));
			}
		} catch(Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		} finally {
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
}
