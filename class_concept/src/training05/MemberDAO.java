package training05;

import java.util.HashMap;

public class MemberDAO {
	private HashMap<String, MemberDTO> members;
	
	public MemberDAO() {
		members = new HashMap<String, MemberDTO>();
	}
	
	public void insert(MemberDTO dto) {
		members.put(dto.getId(), dto);
	}
	
	public MemberDTO selectOne(String id) {
		return members.get(id);
	}
	
	public void delete(String id) {
		members.remove(id);
	}
	
	public HashMap<String, MemberDTO> selectAll() {
		return members;
	}
	
	public void update(MemberDTO dto) {
		members.replace(dto.getId(), dto);
	}

}
