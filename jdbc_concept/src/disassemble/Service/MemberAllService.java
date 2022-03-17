package disassemble.Service;

import java.util.Collection;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class MemberAllService {
	private MemberDAO memberDao;
	
	public MemberAllService(MemberDAO memberDao){
		this.memberDao = memberDao;
	}
	
	public void selectAll() {
		// MemberDAO 객체 내부 selectAll() 호출 후 회원 모든 정보 출력
		Collection<MemberDTO> members = memberDao.selectAll();
		
		if (members.size() == 0) {
			System.out.println("등록된 회원이 없습니다.");
		} else {
			System.out.println("회원번호 \t 이메일 \t\t 이름 \t 비밀번호 \t 등록일");
			for (MemberDTO member : members) {
				System.out.println(member.getNum() + " \t " + member.getEmail() + " \t\t " + member.getName()
									+ " \t " + member.getPassword() + " \t " + member.getRegisterDate() );
			}
		}
		
		
	}

}
