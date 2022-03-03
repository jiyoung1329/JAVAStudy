package training04;

import java.util.ArrayList;

public class MemberDAO {
	private ArrayList<MemberDTO> members;
	
	public MemberDAO() {
		members = new ArrayList<MemberDTO>();
	}
	
	public int searchIndex(String id) {
		int index;
		for (int i = 0; i<members.size(); i++) {
			if (members.get(i).getId().equals(id))
				return i;
		}
		return -1;
	}
	
	public void insert(MemberDTO dto) {
		members.add(dto);
	}
	
	public MemberDTO selectOne(int index) {
		return members.get(index);
	}
	
	public void delete(int index) {
		members.remove(index);
	}
	
	public ArrayList<MemberDTO> selectAll() {
		return members;
	}
	
	public void update(int index, MemberDTO dto) {
		members.set(index, dto);
	}

}
