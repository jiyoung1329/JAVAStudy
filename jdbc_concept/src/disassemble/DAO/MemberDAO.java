package disassemble.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import disassemble.DTO.MemberDTO;

public class MemberDAO implements IMemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	private String url, uid, upw;

	private ArrayList<MemberDTO> members;

	public MemberDAO() {
		conn = null;
		ps = null;
		rs = null;

		url = "jdbc:oracle:thin:@localhost:1521:xe";
		uid = "oracle";
		upw = "oracle";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Collection<MemberDTO> selectAll() {
		ArrayList<MemberDTO> members = new ArrayList<MemberDTO>();
		String query = "select * from member";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setNum(rs.getInt("num"));
				member.setEmail(rs.getString("email"));
				member.setName(rs.getString("name"));
				member.setPassword(rs.getString("password"));
				member.setRegisterDate(rs.getString("registerDate"));

				members.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			exit();
		}

		return members;
	}

	@Override
	public MemberDTO selectEmail(String email) {
		MemberDTO member = null;
		String query = "select * from member where email=?";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				member = new MemberDTO();
				member.setNum(rs.getInt("num"));
				member.setEmail(rs.getString("email"));
				member.setPassword(rs.getString("password"));
				member.setName(rs.getString("name"));
				member.setRegisterDate(rs.getString("registerDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			exit();
		}

		return member;
	}

	@Override
	public void insert(MemberDTO member) {
		String query = "insert into member(num, email, password, name, registerDate) "
				+ "values(member_seq.nextval, ?, ?, ?, ?)";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, member.getEmail());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getName());
			ps.setString(4, member.getRegisterDate());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			exit();
		}
	}

	@Override
	public void update(MemberDTO member) {
		String query = "update member set password = ? where email = ?";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, member.getPassword());
			ps.setString(2, member.getEmail());
			ps.executeUpdate();
			System.out.println("비밀번호 변경이 완료되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			exit();

		}
	}

	@Override
	public void delete(String email) {
		String query = "delete from member where email = ?";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			ps.executeUpdate();
			System.out.println("회원삭제가 완료되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			exit();
		}
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
