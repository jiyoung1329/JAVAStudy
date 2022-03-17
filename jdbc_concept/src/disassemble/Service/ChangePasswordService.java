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
		if (member != null) {
			// 패스워드 확인 및 MemberDAO.update() 호출
			if (member.getPassword().equals(oldPw)) {
				member.setPassword(newPw);
				memberDao.update(member);
				
			} else {
				System.out.println("기존 비밀번호와 일치하지 않습니다.");
			}
		} else {
			System.out.println("등록된 회원이 아닙니다.");
		}
	}

}
