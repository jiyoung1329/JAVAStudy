package jdbc_concept02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
	/*
	 * concept02 테이블 생성
	 *  - 회원번호, 이메일, 이름, 전화번호
	 * 
	 * concept02_seq sequence 생성하여 회원번호로 활용
	 * 
	 * 각 역할에 맞는 메소드를 구현하세요.
	 *  - insert(), selectEmail(), delete(), selectAll(), update()
	 * 
	 */
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String uid = "oracle";
	private static String upw = "oracle";
	
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String email = "", name="", mobile="";
		loadDriver();
		
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 회원 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(in.next());

			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1:
				System.out.println("=== 회원 등록 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("이름 : ");	name = in.next();
				System.out.print("전화번호 : "); mobile = in.next();
				insert(email, name, mobile);
				break;
			case 2:
				System.out.println("=== 회원 검색 ===");
				System.out.print("이메일 : "); email = in.next();
				selectEmail(email);
				break;
			case 3:
				System.out.println("=== 회원 삭제 ===");
				System.out.print("이메일 : "); email = in.next();
				delete(email);
				break;

			case 4:	selectAll(); break;
			case 5:
				System.out.println("=== 회원 수정 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("이름 : ");	name = in.next();
				System.out.print("전화번호 : "); mobile = in.next();
				update(email, name, mobile);
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}

	}
	
	public static void insert(String email, String name, String mobile) {
		
		String query = "insert into concept02 values(concept02_seq.nextval, ?, ?, ?)";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, name);
			ps.setString(3, mobile);
			int result = ps.executeUpdate();
			
			if (result == 1) {
				System.out.println("회원등록이 완료되었습니다.");
			} else {
				System.out.println("회원등록을 실패하였습니다.");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		
	}
	
	public static void selectEmail(String email) {
		String query = "select * from concept02 where email=?";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("회원번호 \t 이메일 \t 이름 \t 전화번호");
				System.out.println(rs.getInt("num") + " \t " +rs.getString("email") + " \t " + rs.getString("name") + " \t " + rs.getString("mobile"));
			} else {
				System.out.println("해당 회원 정보는 없습니다.");
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}
	public static void delete(String email) {
		String query = "delete from concept02 where email = ?";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			int result = ps.executeUpdate();
			
			if (result == 1) {
				System.out.println("회원삭제가 완료되었습니다.");
			} else {
				System.out.println("회원삭제를 실패하였습니다.");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}
	public static void selectAll() {
		String query = "select * from concept02";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			
			System.out.println("회원번호 \t 이메일 \t 이름 \t 전화번호");
			while (rs.next()) {
				System.out.println(rs.getInt("num") + " \t " + rs.getString("email") + " \t " + rs.getString("name") + " \t " + rs.getString("mobile"));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
	}
	public static void update(String email, String name, String mobile) {
		String query = "update concept02 set name = ?, mobile=? where email = ?";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, mobile);
			ps.setString(3, email);
			int result = ps.executeUpdate();
			
			if (result == 1) {
				System.out.println("회원등록이 완료되었습니다.");
			} else {
				System.out.println("회원등록을 실패하였습니다.");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}
	
	public static void loadDriver() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeConnection() {
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
