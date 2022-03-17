package jdbc_concept03_1;

import java.util.ArrayList;

public class MemberService {
	private MemberDAO memberDao = new MemberDAO();
	
	public void insert(MemberDTO member) {
		MemberDTO check = memberDao.selectEmail(member.getEmail());
		if(check == null) {
			memberDao.insert(member);
			System.out.println(member.getEmail() + " 계정 등록 완료");
		}else {
			System.out.println(member.getEmail() + " 계정 사용 중");
		}
	}

	public void selectEmail(String email) {
		MemberDTO member = memberDao.selectEmail(email);
		if(member != null) {
			System.out.println("회원 번호\t이메일\t\t\t이름\t비밀 번호");
		System.out.println(member.getNum()+"\t"+member.getEmail()+"\t\t"+member.getName()+"\t"+member.getPassword());
		}else {
			System.out.println(email + "계정 미등록");
		}
	}

	public void delete(MemberDTO member) {
		MemberDTO check = memberDao.selectEmail(member.getEmail());
		if(check != null) {
			if(check.getPassword().equals(member.getPassword())) {
				int result = memberDao.delete(member.getEmail());
				if(result == 1) {
					System.out.println(member.getEmail() + "계정 삭제 완료");
				}else {
					System.out.println(member.getEmail() + "계정 삭제 실패, 다시 시도 하세요.");
				}
			}else {
				System.out.println("패스워드가 다름");
			}
			
		}else {
			System.out.println(member.getEmail() + "계정 미등록");
		}
	}

	public void selectAll() {
		ArrayList<MemberDTO> members = memberDao.selectAll();
		if(members.isEmpty() == false) {
			System.out.println("회원 번호\t이메일\t\t\t이름\t비밀 번호");
			for(MemberDTO member : members)
				System.out.println(member.getNum()+"\t"+member.getEmail()+"\t\t"+member.getName()+"\t"+member.getPassword());
		}
		
	}

	public void update(MemberDTO member) {
		MemberDTO check = memberDao.selectEmail(member.getEmail());
		if(check != null) {
			if(check.getPassword().equals(member.getPassword())) {
				int result = memberDao.update(member);
				if(result == 1) {
					System.out.println(member.getEmail() + "계정의 비밀번호 수정 완료");
				}else {
					System.out.println(member.getEmail() + "계정 비밀번호 수정 실패, 다시 시도 하세요.");
				}
			}else {
				System.out.println("패스워드가 다름");
			}
		}else {
			System.out.println(member.getEmail() + "계정 미등록");
		}
	}

	public void exit() {
		memberDao.exit();
	}

}
