package training02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static MemberDaoImpl dao = new MemberDaoImpl();
	private static ArrayList<MemberDTO> members;
	
	private static String email, name, mobile;
	// 유효성 검사- test
	private static String emailRegExp = "[A-Za-z0-9+_.-]+@(.+)$";
	private static String telRegExp = "^0\\d{1,2}-\\d{3,4}-\\d{4}$";

	// 회원 신규 등록
	public static void insert() {
		dao.insert(inputEmail(), inputName(), inputMobile());
	}

	// 검색하기
	public static void selectOne() {
		MemberDTO dto = dao.selectOne(dao.selectIndex(inputEmail()));
		System.out.println("이메일 : " + dto.getEmail() + ", \t이름 : " + dto.getName() + ", \t전화번호 : " + dto.getMobile());
		
	}

	// 회원 전체 출력
	public static void selectAll() {
		members = dao.selectAll();
		for (int i=0; i<members.size(); i++) {
			MemberDTO dto = members.get(i);
			System.out.println((i+1) + ". 이메일 : " + dto.getEmail() + ", \t이름 : " + dto.getName() + ", \t전화번호 : " + dto.getMobile());
		}
	}

	// 회원 삭제
	public static void delete() {
		int index = dao.selectIndex(inputEmail());

		if (dao.selectIndex(email) == -1) {
			System.out.println("존재하지 않은 회원입니다.");
		} else {
			dao.delete(index);
			
		}
	}

	// 회원 수정
	public static void update() {
		int index = dao.selectIndex(inputEmail());
		
		if (dao.selectIndex(email) == -1) {
			System.out.println("존재하지 않은 회원입니다.");
		} else {
			dao.update(index, inputName(), inputMobile());
			
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
	public static String inputEmail() {
		String email;

		while (true) {
			System.out.print("이메일을 입력해 주세요 >> ");
			email = sc.next();

			// 이메일 유효성 검사
			if (email.matches(emailRegExp)) {
				return email;

			} else {
				System.out.println("유효한 이메일이 아닙니다. 다시 입력해주세요.");
			}
		}

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
		String tel;
		while (true) {
			System.out.print("전화번호를 입력해 주세요 >> ");
			tel = sc.next();

			if (tel.matches(telRegExp))
				break;
			else {
				System.out.println("잘못된 전화번호입니다. 다시 입력해주세요.");
			}
		}

		return tel;
	}

	public static void main(String[] args) {
		/*
		 * 회원 등록 : 이름(중복허용), 전화번호(중복허용), 이메일(중복허용안됨) 회원 검색 : 이메일로 검색하여 있으면 이름 전화번호 이메일
		 * 출력, 없으면 없음 출력 회원 삭제 : 이메일로 검색하여 있으면 이름과 전화번호, 이메일 삭제, 없으면 없음 출력 회원 수정 : 이메일로
		 * 검색하여 있으면 이름에 전화번호, 이메일 수정, 없으면 없음 출력
		 */
		String name, tel, email;
		String[] infos;

		int choose, idx;

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
				selectAll();
			}

			// 회원 삭제
			else if (choose == 4) {
				delete();

			}
			// 회원 수정
			else if (choose == 3) {
				// 회원 출력
				update();

				// 회원 검색
			} else if (choose == 2) {
				selectOne();

				// 회원 등록
			} else if (choose == 1) {
				System.out.println("새로운 회원을 등록하세요!\n");
				insert();

			} else {
				System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
			}

		}
	}

}
