package training03;

import java.util.ArrayList;

public interface IMemberDAO {
	public int selectIndex(String email);
	
	public void insert(MemberDTO dto);
	public MemberDTO selectOne(int index);
	public void delete(int index);
	public void update(int index, MemberDTO dto);
	public ArrayList<MemberDTO> selectAll();
	
}
