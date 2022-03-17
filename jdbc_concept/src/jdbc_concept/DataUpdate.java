package jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DataUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정하고 싶은 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (Exception e) {
			System.out.println("드라이버 로드 실패");
		}

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "oracle";
		String upw = "oracle";

		String query = "update test_table set pw=?, name=? where id=?";

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DriverManager.getConnection(url, uid, upw);

			ps = conn.prepareStatement(query);
			ps.setString(1, pw);
			ps.setString(2, name);
			ps.setString(3, id);
			int result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("회원 정보 수정 성공");
			} else {
				System.out.println("회원 정보 수정 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
