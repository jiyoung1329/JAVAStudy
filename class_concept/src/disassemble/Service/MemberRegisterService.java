package disassemble.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;
import disassemble.DTO.RegisterRequest;

public class MemberRegisterService {
	private MemberDAO memberDao;
	private SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDao = memberDao;
		
	}
	
	public void regist(RegisterRequest req) {
		
		// password == confirmPassword
		if (req.getPassword().equals(req.getConfirmPassword())) {
			
			// email로 계정 등록 여부 확인
			if (memberDao.selectEmail(req.getEmail()) == null) {
				// memberDao.insert() 계정 등록
				// 순서 : 이메일, 암호, 이름, 시간
				memberDao.insert(new MemberDTO(req.getEmail(), req.getPassword(), req.getName(), sDate.format(new Date())));
				System.out.println("회원 등록이 완료되었습니다.");
				
			} else 
				System.out.println("이미 존재하는 계정입니다. 다른 이메일을 입력해 주세요.");
			
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}

}
