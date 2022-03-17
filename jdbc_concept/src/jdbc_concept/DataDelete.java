package jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DataDelete {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "oracle";
		String upw = "oracle";
		
		String query1 = "select pw from test_table where id = ?";
		String query2 = "delete from test_table where id = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query1);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.print("회원 비밀번호를 입력해 주세요 : ");
				String pw = sc.next();
				System.out.println(rs.getString("pw"));
				if (rs.getString("pw").equals(pw)) {
					ps = conn.prepareStatement(query2);
					ps.setString(1, id);
					int result = ps.executeUpdate();
					if (result == 1) {
						System.out.println("회원 정보가 정상적으로 삭제되었습니다.");
					} else {
						System.out.println("회원정보 삭제 실패했습니다.");
					}
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			} else {
				System.out.println("해당 회원 정보가 없습니다.");
			}
			
		} catch(SQLException e) {
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
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
