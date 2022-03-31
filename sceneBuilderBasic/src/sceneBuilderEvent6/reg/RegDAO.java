package sceneBuilderEvent6.reg;

import java.sql.Connection;
import java.sql.PreparedStatement;

import sceneBuilderEvent6.login.LoginDAO;

public class RegDAO extends LoginDAO{
	
	public void insert(RegDTO reg) {
//		SQL> INSERT INTO fx_concept VALUES('관리자', 'admin', '1234', '남', '30대', '스포츠 영화');
		String query = "insert into fx_concept values (?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = getConn();
			ps = conn.prepareStatement(query);
			ps.setString(1, reg.getName());
			ps.setString(2, reg.getId());
			ps.setString(3, reg.getPw());
			ps.setString(4, reg.getGender());
			ps.setString(5, reg.getAge());
			ps.setString(6, reg.getHobbys());
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) ps.close();
				if (conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}

}
