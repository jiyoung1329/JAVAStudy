package training04;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static MemberService service = new MemberService();
	
	public static void main(String[] args) {
		/*
		 * 회원 관리 프로그램 만들기 : 1~5번에 해당 메소드 구현
		 * 1. 회원 등록 : id, password, name 3개의 정보
		 * 2. 회원 검색 : id를 이용하여 회원 정보를 검색하여 출력
		 * 3. 회원 삭제 : id를 이용하여 회원 정보 삭제
		 * 4. 회원 모두 보기
		 * 5. 비밀번호 수정
		 * 6. 프로그램 종료
		 */
		
		int menu;
		while(true) {
			
			printMenu();
			menu = inputMenu();
			
			if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu == 5){
				service.selectAll();
			} else if (menu == 4) {
				service.delete(inputId(menu));
			} else if (menu == 3) {
				service.updatePwd(inputId(menu), inputPwd(menu));
			} else if (menu == 2) {
				service.search(inputId(menu));
			} else if (menu == 1) {
				System.out.println("새로운 회원을 등록해주세요!");
				service.insert(inputId(menu), inputPwd(menu), inputName());
			} else {
				System.out.println("잘못 입력하였습니다. 다시 입력해 주세요.");
			}
			
			
		}
		
		
	}
	
	// 메뉴 프린트
		public static void printMenu() {
			System.out.println();
			System.out.println("아레 메뉴 중 선택해 주세요.");
			System.out.println("----------------------------");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 비밀번호 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 회원 모두보기");
			System.out.println("5. 프로그램 종료");
			System.out.println("----------------------------");
			System.out.print("선택 >> ");
		}

		// 메뉴 입력 받기
		public static int inputMenu() {
			int menu;

			while (true) {
				try {
					menu = sc.nextInt();
					break;

				} catch (Exception e) {
					System.out.println("숫자를 입력해 주세요");
					sc.nextLine();
				}
			}

			return menu;
		}
		
		// id 입력 받기
		public static String inputId(int menu) {
			String id;
			
			if (menu == 1) {
				while (true) {
					System.out.print("새로 등록할 아이디를 입력해주세요 >> ");
					id = sc.next();
					
					if (service.isDuplicatedId(id)) {
						System.out.println("이미 존재하는 아이디 입니다. 다시 입력해 주세요.");
						continue;
					}
					return id;
				}
				
			} else {
				if (menu == 2) {
					System.out.print("검색할 아이디를 입력해주세요 >> ");
					
				} else if (menu == 3) {
					System.out.print("수정할 아이디를 입력해주세요 >> ");
					
				} else if (menu == 4) {
					System.out.print("삭제할 아이디를 입력해주세요 >> ");
					
				}
				
				id = sc.next();
				return id;
			}
				
		}
		
		// password 입력받기
		public static String inputPwd(int menu) {
			String pwd;
			
			if (menu == 3) {
				while (true) {
					System.out.print("새로운 비밀번호를 입력해주세요(숫자, 영어대소문자 포함 8글자 이상) >> ");
					pwd = sc.next();
					if (service.checkPwd(pwd)) {
						return pwd;
					} else {
						System.out.println("올바른 비밀번호가 아닙니다. 다시 입력해주세요.");
					}
					
				}
			} else {
				while (true) {
					System.out.print("비밀번호를 입력해주세요(숫자, 영어대소문자 포함 8글자 이상) >> ");
					pwd = sc.next();
					if (service.checkPwd(pwd)) {
						return pwd;
					} else {
						System.out.println("올바른 비밀번호가 아닙니다. 다시 입력해주세요.");
					}
					
				}
				
			}
			
		}
		
		// 이름 입력받기
		public static String inputName() {
			System.out.print("이름을 입력해주세요.");
			return sc.next();
		}
	
	
	

}
