package training02;

import java.util.ArrayList;

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
	public void insert(String email, String name, String mobile) {
		if (selectIndex(email) == -1) {
			members.add(new MemberDTO(email, name, mobile));
			System.out.println("회원 등록 완료!");
		} else {
			System.out.println("이미 존재하는 이메일 입니다.");
		}
	}

	@Override
	public MemberDTO selectOne(int index) {
		// 여기서 출력
		if (index == -1) {
			System.out.println("존재하지 않은 회원 정보 입니다.");
			return null;

		} else {
			MemberDTO dto = members.get(index);
			return dto;
		}

	}

	@Override
	public void delete(int index) {
		members.remove(index);
		System.out.println("회원 정보 삭제가 완료되었습니다.");
	}

	@Override
	public void update(int index, String name, String mobile) {
		MemberDTO dto = members.get(index);
		dto.setName(name);
		dto.setMobile(mobile);
		members.set(index, dto);

		System.out.println("회원 정보 수정이 완료되었습니다.");

	}

	@Override
	public ArrayList<MemberDTO> selectAll() {
		return members;
	}

}
