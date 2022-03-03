package training03;

import java.util.ArrayList;

// 데이터베이스 접근
public class MemberDaoImpl implements IMemberDAO {

	private ArrayList<MemberDTO> members = new ArrayList<>();
	
	@Override
	public int selectIndex(String email) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getEmail().equals(email)) {
				return i;
			}
		}
		return -1;

	}

	@Override
	public void insert(MemberDTO dto) {
		members.add(dto);

	}

	@Override
	public MemberDTO selectOne(int index) {
		MemberDTO dto = members.get(index);
		return dto;

	}

	@Override
	public void delete(int index) {
		members.remove(index);
		
	}

	@Override
	public void update(int index, MemberDTO dto) {
		members.set(index, dto);
		

	}

	@Override
	public ArrayList<MemberDTO> selectAll() {
		return members;
	}

}
