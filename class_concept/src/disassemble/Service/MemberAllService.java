package disassemble.Service;

import java.util.HashMap;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class MemberAllService {
	private MemberDAO memberDao;

	public MemberAllService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}

	public void selectAll() {
		// MemberDAO 객체 내부 selectAll() 호출 후 회원 모든 정보 출력
		HashMap<String, MemberDTO> members = memberDao.selectAll();

		int i = 1;
		if (members.size() == 0) {
			System.out.println("등록된 회원 정보가 없습니다.");
			return;
		}
		for (MemberDTO dto : members.values()) {
			System.out.println((i++) + ". 이메일 : " + dto.getEmail() + ",\t 이름 : " + dto.getName() + ",\t 비밀번호 : "
					+ dto.getPassword() + " \t 회원가입일 : " + dto.getRegisterDate());
		}
	}

}
