package disassemble.Service;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class ChangePasswordService {
	private MemberDAO memberDao;

	public ChangePasswordService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}

	public void changePassword(String email, String oldPw, String newPw) {
		MemberDTO member = memberDao.selectEmail(email);
		// 이메일 등록여부 확인.
		if (member == null) {
			System.out.println("존재하지 않는 회원 입니다.");
		} else {
			// 패스워드 확인 및 MemberDAO.update() 호출
			if (member.getPassword().equals(oldPw)) {
				member.setPassword(newPw);
				memberDao.update(member);
				System.out.println(member.getName() + "님의 비밀번호 수정이 완료되었습니다.");

			} else {
				System.out.println("입력하신 비밀번호가 일치하지 않습니다.");
			}
		}
	}

}
