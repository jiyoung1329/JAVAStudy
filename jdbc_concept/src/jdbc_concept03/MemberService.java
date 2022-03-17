package jdbc_concept03;

import java.util.ArrayList;

public class MemberService {
	
	private String emailRegExp = "[A-Za-z0-9+_.-]+@(.+)$";
	private String pwdRegExp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";;
	private MemberDAO dao;
	
	public MemberService() {
		dao = new MemberDAO();
	}
	
	public void memberCreate(String email, String name, String password) {
		if (!checkEmail(email)) {
			System.out.println("이메일 형식이 알맞지 않습니다.");
			return;
		}
		
		if (!checkPwd(password)) {
			System.out.println("비밀번호는 영문 대,소문자와 숫자를 포함하여 8자 이상 입력해주세요. ");
			return;
		}
		
		MemberDTO dto = dao.MemberSelect(email);
		// 중복 체크
		if (dto != null) {
			System.out.println("이미 존재하는 이메일입니다. 다른 이메일을 입력해주세요.");
		} else {
			int result = dao.MemberCreate(email, name, password);
			if (result == 1) {
				System.out.println("회원가입이 완료되었습니다.");
			} else {
				System.out.println("회원가입을 실패하였습니다.");
			}
		}
	}
	
	public void memberSelect(String email) {
		MemberDTO dto = dao.MemberSelect(email);
		if (dto != null) {
			System.out.println("이메일 \t 이름 \t 비밀번호");
			System.out.println(dto.getEmail() + "\t" + dto.getName() + "\t" + dto.getPassword());
		} else {
			System.out.println("일치하는 회원 정보가 없습니다.");
		}
	}
	
	public void memberSelectAll() {
		ArrayList<MemberDTO> members = dao.MemberSelectAll();
		
		if (members.size() == 0) {
			System.out.println("존재하는 회원정보가 없습니다.");
		} else {
			System.out.println("회원번호 \t 이메일 \t\t 이름 \t\t 비밀번호");
			for (MemberDTO dto : members) {
				System.out.println(dto.getNum() + "\t " + dto.getEmail() + "  \t" + dto.getName() + " \t\t" + dto.getPassword());
			}
		}
		
	}
	
	public void memberUpdate(String email, String password, String changePassword) {
		// 회원 유무 확인
		MemberDTO dto = dao.MemberSelect(email);
		if (dto == null) {
			System.out.println("해당 회원 정보는 존재하지 않습니다.");
		} else {
			
			if (!password.equals(dto.getPassword())) {
				System.out.println("기존 비밀번호와 일치하지 않습니다.");
				return;
			}
		
			if (!checkPwd(changePassword)) {
				System.out.println("비밀번호는 영문 대,소문자와 숫자를 포함하여 8자 이상 입력해주세요. ");
				return;
			}
			
			int result = dao.MemberUpdate(email, changePassword);
			
			if (result == 1) {
				System.out.println("회원 정보 수정이 완료되었습니다.");
			} else {
				System.out.println("회원 정보 수정을 실패하였습니다.");
			}
				
		}
	}
	
	public void memberDelete(String email, String password) {
		MemberDTO dto = dao.MemberSelect(email);
		
		if (dto == null) {
			System.out.println("해당 회원 정보는 존재하지 않습니다.");
		} else {
			if (!password.equals(dto.getPassword())) {
				System.out.println("기존 비밀번호와 일치하지 않습니다.");
				return;
			}
			
			int result = dao.MemberDelete(email);
			if (result == 1) {
				System.out.println("회원 삭제가 완료되었습니다.");
			} else {
				System.out.println("회원 삭제를 실패하였습니다.");
			}
		}
		
	}
	
	public boolean checkEmail(String email) {
		if (email.matches(emailRegExp)) {
			return true;
		}
		return false;
		
	}
	
	public boolean checkPwd(String password) {
		if (password.matches(pwdRegExp)) {
			return true;
		}
		return false;
	}
	

}
