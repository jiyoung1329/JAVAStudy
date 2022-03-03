package training02;

import java.util.ArrayList;

public interface IMemberDAO {
	public int selectIndex(String email);
	
	public void insert(String email, String name, String mobile);
	public MemberDTO selectOne(int index);
	public void delete(int index);
	public void update(int index, String name, String mobile);
	public ArrayList<MemberDTO> selectAll();
	
}
