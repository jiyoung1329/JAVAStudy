package training04;

import java.util.ArrayList;

public class MemberService {
	private String pwdRegExp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
	private MemberDAO dao;
	
	public MemberService() {
		dao = new MemberDAO();
	}
	
	public void insert(String id, String pwd, String name) {
		MemberDTO dto = new MemberDTO(id, pwd, name);
		dao.insert(dto);
	}
	
	public void search(String id) {
		int index = dao.searchIndex(id);
		if (index == -1) {
			System.out.println("해당 아이디는 존재하지 않습니다.");
		}
		else {
			MemberDTO dto = dao.selectOne(index);
			System.out.println("검색된 회원 정보는 아래와 같습니다. ");
			System.out.println("아이디 : " + id + ", \t비밀번호 : " + dto.getPwd() + ", \t이름 : " + dto.getName());
		}
	}
	
	public void delete(String id) {
		int index = dao.searchIndex(id);
		if (index == -1) {
			System.out.println("해당 아이디는 존재하지 않습니다.");
		}
		else {
			dao.delete(index);
			System.out.println("회원 정보 삭제가 완료되었습니다. ");
		}
	}
	
	public void updatePwd(String id, String pwd) {
		int index = dao.searchIndex(id);
		if (index == -1) {
			System.out.println("해당 아이디는 존재하지 않습니다.");
		}
		else {
			MemberDTO dto = dao.selectOne(index);
			dto.setPwd(pwd);
			dao.update(index, dto);
			System.out.println("비밀번호 수정이 완료되었습니다.");
		}
	}
	
	public void selectAll() {
		ArrayList<MemberDTO> members = dao.selectAll();
		for (int i=0; i<members.size(); i++) {
			MemberDTO dto = members.get(i);
			System.out.println((i+1) + ". 아이디 : " + dto.getId() + ", \t비밀번호 : " + dto.getPwd() + ", \t이름 : " + dto.getName());
		}
		
	}

	public boolean isDuplicatedId(String id) {
		if (dao.searchIndex(id) == -1) 
			return false;
		
		return true;
	}
	
	public boolean checkPwd(String pwd) {
		if (pwd.matches(pwdRegExp))
			return true;
		
		return false;
	}

}
