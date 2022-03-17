package jdbc_concept03_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String email = "", name="", password="";
		
		MemberService service = new MemberService();
		MemberDTO member;
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 비밀번호 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(in.next());

			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1:
				System.out.println("=== 회원 등록 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("이름 : ");	name = in.next();
				System.out.print("비밀번호 : "); password = in.next();
				
				member = new MemberDTO();
				member.setEmail(email);
				member.setName(name);
				member.setPassword(password);
				service.insert(member);
				break;
			case 2:
				System.out.println("=== 회원 검색 ===");
				System.out.print("이메일 : "); email = in.next();
				service.selectEmail(email);
				break;
			case 3:
				System.out.println("=== 회원 삭제 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("비밀번호 : "); password = in.next();
				member = new MemberDTO();
				member.setEmail(email);
				member.setPassword(password);
				service.delete(member);
				break;

			case 4:	service.selectAll(); break;
			case 5:
				System.out.println("=== 비밀번호 수정 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("현재 비밀번호 : ");	password = in.next();
				System.out.print("변경 비밀번호 : "); String changePassword = in.next();
				member = new  MemberDTO();
				member.setEmail(email);
				member.setPassword(password);
				member.setChangePassword(changePassword);
				service.update(member);
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				service.exit();
				System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}

	}

}
