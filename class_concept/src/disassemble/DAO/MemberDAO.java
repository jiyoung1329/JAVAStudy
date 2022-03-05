package disassemble.DAO;

import java.util.HashMap;

import disassemble.DTO.MemberDTO;

public class MemberDAO implements IMemberDAO {
	// HashMap 생성
	// 회원 정보 저장 : Key(이메일), Value(MemberDTO)
	private HashMap<String, MemberDTO> members = new HashMap<String, MemberDTO>();
	
	
	// 회원 전체 조회 메소드
	@Override
	public HashMap<String, MemberDTO> selectAll() {
		return members;
	}

	// 회원 한명 조회 메소드
	@Override
	public MemberDTO selectEmail(String email) {
		return members.get(email);
	}

	// 회원 입력 메소드
	@Override
	public void insert(MemberDTO member) {
		members.put(member.getEmail(), member);

	}

	// 회원 정보 변경 메소드
	@Override
	public void update(MemberDTO member) {
		members.replace(member.getEmail(), member);
	}

	// 회원 정보 삭제 메소드
	@Override
	public void delete(String email) {
		members.remove(email);
	}

}
