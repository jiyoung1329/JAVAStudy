package training03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static MemberService service = new MemberService();

	private static String email, name, mobile;

	public static void main(String[] args) {
		/*
		 * 회원 등록 : 이름(중복허용), 전화번호(중복허용), 이메일(중복허용안됨) 회원 검색 : 이메일로 검색하여 있으면 이름 전화번호 이메일
		 * 출력, 없으면 없음 출력 회원 삭제 : 이메일로 검색하여 있으면 이름과 전화번호, 이메일 삭제, 없으면 없음 출력 회원 수정 : 이메일로
		 * 검색하여 있으면 이름에 전화번호, 이메일 수정, 없으면 없음 출력
		 */
		int choose;

		System.out.println(" >>>>> 회원 관리 프로그램 <<<<<");
		while (true) {

			printMenu();
			choose = inputMenu();

			// 프로그램 종료
			if (choose == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// 회원 모두 보기
			else if (choose == 5) {
				service.selectAll();
			}

			// 회원 삭제
			else if (choose == 4) {
				service.delete(inputEmail(choose));

			}
			// 회원 수정
			else if (choose == 3) {
				service.update(new MemberDTO(inputEmail(choose), inputName(), inputMobile()));

				// 회원 검색
			} else if (choose == 2) {
				service.selectOne(inputEmail(choose));

				// 회원 등록
			} else if (choose == 1) {
				System.out.println("새로운 회원을 등록하세요!\n");
				service.insert(new MemberDTO(inputEmail(choose), inputName(), inputMobile()));

			} else {
				System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
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
		System.out.println("3. 회원 수정");
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

	// 이메일 입력 받기
	public static String inputEmail(int choose) {
		String email;
		
		while (true) {
			System.out.println("이메일을 입력해 주세요 >> ");
			email = sc.next();
			// 새 계정 생성시 이메일 중복 체크
			if (service.checkEmail(email)) {
				if (choose == 1) {
					if (service.isDuplicatedEmail(email))
						continue;
				}
				break;
				
			} else continue;
		}
		return email;
		
	}

	// 이름 입력받기
	public static String inputName() {
		String name;

		System.out.print("이름을 입력해 주세요 >> ");
		name = sc.next();

		return name;
	}

	// 전화번호 입력받기
	public static String inputMobile() {
		String mobile;
		
		while (true) {
			System.out.println("전화번호를 입력해 주세요 >> ");
			mobile = sc.next();
			if (service.checkMobile(mobile)) 
				return mobile;
		}
	}

}
