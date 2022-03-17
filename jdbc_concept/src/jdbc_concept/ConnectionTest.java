package jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ConnectionTest {
	public static void main(String[] args) {
		/*
		 * JDBC(Java DataBase Connectivity)
		 * : 자바 프로그램에서 데이터베이스 연결을 도와주는 기능의 집합
		 * 
		 * 작업 순서
		 * 1. JDBC Driver 실행
		 * 2. DataBase로 연결
		 * 3. SQL 쿼리문을 전달하기 위한 객체(PreparedStatement) 생성
		 * 4. 쿼리문을 담은 객체 내 메소드를 호출하여 DataBase로 전달
		 * 5. Select 쿼리문을 전달했다면 결과가 존재하기에 객체(ResultSet)로 받음
		 * 6. 위에서 열어둔 객체 해제
		 */
		try {
			/*
			 * 컴퓨터의 주소 : IP 주소
			 * Port Address or Port Number(컴퓨터에서 동작 중인 프로그램 식별 번호)
			 * Oracle DataBase : 1521;
			 */
			
			// new OracleDriver() 처럼 새로운 driver 객체를 생성한 것
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 완료");
		} catch(Exception e) {
			System.out.println("드라이버 로드 실패");
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String password = "oracle";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 아이디 : ");
		String id = sc.next();

		//String query = "select id, pw from test_table where id = '" + id + "'";
		String query = "select id, pw from test_table where id=?";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		try {
			// DB 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공");
			
			// 쿼리 날릴 객체(PreparedStatement) 생성
			ps = con.prepareStatement(query);
			ps.setString(1, id);
			
			// 쿼리문을 db로 전달 & 결과 반환
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("아이디\t비밀번호");
				System.out.println(rs.getString("id") + "\t" + rs.getString("pw"));
			}
			
			
		} catch(Exception e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		
		
		
		
	}
}
