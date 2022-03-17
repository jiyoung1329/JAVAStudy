package disassemble.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;
import disassemble.DTO.RegisterRequest;

public class MemberRegisterService {
	private MemberDAO memberDao;
	
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDao = memberDao;
		
	}
	public void regist(RegisterRequest req) {
		// password == confirmPassword
		if (req.getPassword().equals(req.getConfirmPassword())) {
			
			// email로 계정 등록 여부 확인
			if (memberDao.selectEmail(req.getEmail()) == null) {
				// memberDao.insert() 계정 등록
				MemberDTO member = new MemberDTO();
				member.setEmail(req.getEmail());
				member.setName(req.getName());
				member.setPassword(req.getPassword());
				
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String registerDate = sdf.format(date);
				member.setRegisterDate(registerDate);
				
				memberDao.insert(member);
				System.out.println("회원 등록이 완료되었습니다.");
			} else {
				System.out.println("이미 존재하는 회원입니다.");
			}
			
		} else {
			System.out.println("두 비밀번호가 일치하지 않습니다.");
		}
	}

}
