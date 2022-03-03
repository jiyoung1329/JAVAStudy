package training03;

import java.util.ArrayList;

// 데이터 검증이나 데이터 출력
public class MemberService {
	private MemberDaoImpl dao;
	
	// 유효성 검사- test
	private static String emailRegExp = "[A-Za-z0-9+_.-]+@(.+)$";
	private static String telRegExp = "^0\\d{1,2}-\\d{3,4}-\\d{4}$";
	
	public MemberService(){
		dao = new MemberDaoImpl();
	}
	
	// 회원 신규 등록
	public void insert(MemberDTO dto) {
		int index = dao.selectIndex(dto.getEmail());
		if (index == -1) {
			dao.insert(dto);
			System.out.println("회원 등록 완료!");
		} else {
			System.out.println("이미 존재하는 이메일 입니다.");
		}
	}

	// 검색하기
	public void selectOne(String email) {
		int index = dao.selectIndex(email);
		// 여기서 출력
		if (index == -1) {
			System.out.println("존재하지 않은 회원 정보 입니다.");

		} else {
			MemberDTO dto = dao.selectOne(index);
			System.out.println("이메일 : " + dto.getEmail() + ", \t이름 : " + dto.getName() + ", \t전화번호 : " + dto.getMobile());
		}

	}

	// 회원 전체 출력
	public void selectAll() {
		ArrayList<MemberDTO> members = dao.selectAll();
		
		for (int i = 0; i < members.size(); i++) {
			MemberDTO dto = members.get(i);
			System.out.println((i + 1) + ". 이메일 : " + dto.getEmail() + ", \t이름 : " + dto.getName() + ", \t전화번호 : "
					+ dto.getMobile());
		}
	}

	// 회원 삭제
	public void delete(String email) {
		int index = dao.selectIndex(email);

		if (dao.selectIndex(email) == -1) {
			System.out.println("존재하지 않은 회원입니다.");
		} else {
			dao.delete(index);
			System.out.println("회원 정보 삭제가 완료되었습니다.");

		}
	}

	// 회원 수정
	public void update(MemberDTO dto) {
		int index = dao.selectIndex(dto.getEmail());
		
		if (index == -1) {
			System.out.println("존재하지 않은 회원입니다.");
		} else {
			dao.update(index, dto);
			System.out.println("회원 정보 수정이 완료되었습니다.");

		}
	}
	
	public boolean checkEmail(String email) {
		if (email.matches(emailRegExp)) {
			return true;

		} else {
			System.out.println("유효한 이메일이 아닙니다. 다시 입력해주세요.");
			return false;
		}
	}

	public boolean checkMobile(String mobile) {
		if (mobile.matches(telRegExp)) 
			return true;
		else {
			System.out.println("잘못된 전화번호입니다. 다시 입력해주세요.");
			return false;
		}
	}
	
	public boolean isDuplicatedEmail(String email) {
		if (dao.selectIndex(email) != -1) {
			System.out.println("이미 존재하는 이메일 입니다.");
			return true;
		} else 
			return false;
	}

	

}
