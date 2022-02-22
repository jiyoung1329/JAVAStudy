package hashMap;

import java.util.HashMap;
import java.util.Scanner;

import javax.xml.stream.events.Namespace;

public class Quiz03 {

	private static HashMap<String, String> names = new HashMap<String, String>();
	private static HashMap<String, String> passwords = new HashMap<String, String>();

	public static void main(String[] args) {
		/*
		 * HashMap을 사용하여 회원 정보 만들기 HashMap은 password와 name을 저장하기 위해 두 개를 저장함
		 * 
		 * 1. 회원 등록 : id, password, name 3개의 정보로 등록함 id는 key로 password, name은 value로 사용
		 * 
		 * 2. 회원 검색 : id를 키로 사용중이기에 id를 이요하여 회원정보를 검색하여 출력 3. 회원 삭제 : id를 키로 회원정보 삭제 4.
		 * 회원 모두 보기 : 모든 정보 출력 5. 비밀번호 수정 : id를 키로, 비밀번호 수정 6. 프로그램 종료 : 프로그램을 종료
		 */

		Scanner sc = new Scanner(System.in);

		int choose;
		while (true) {

			printMenu();

			try {
				System.out.print("선택 >> ");
				choose = sc.nextInt();
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요. ");
				sc.nextLine();
				continue;
			}


			if (choose == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (choose == 5) modifyPassword(sc);
			else if (choose == 4) printInfo();
			else if (choose == 3) deleteInfo(sc);
			else if (choose == 2) searchInfo(sc);
			else if (choose == 1) addInfo(sc);
			else System.out.println("잘못 입력하였습니다.");
			
				

		}
	}

	// 메뉴 출력
	public static void printMenu() {
		line();
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 삭제");
		System.out.println("4. 회원 정보 조회");
		System.out.println("5. 패스워드 수정");
		System.out.println("6. 프로그램 종료");
		line();
	}

	// 회원 등록
	public static void addInfo(Scanner sc) {
		String id, pwd, name;

		while (true) {
			System.out.print("등록할 회원의 아이디를 입력하세요 >> ");
			id = sc.next();
			sc.nextLine();

			if (names.containsKey(id)) {
				System.out.println("이미 존재하는 아이디입니다. 다른 아이디를 입력하세요.");
			} else {

				System.out.print("패스워드를 입력하세요 >> ");
				pwd = sc.next();
				sc.nextLine();

				System.out.print("이름을 입력하세요 >> ");
				name = sc.next();
				sc.nextLine();

				passwords.put(id, pwd);
				names.put(id, name);

				break;
			}
		}
	}

	// 회원 검색
	public static void searchInfo(Scanner sc) {

		printInfo();
		
		if (!names.isEmpty()) {
			System.out.print("검색할 회원의 아이디를 입력하세요 >> ");
			String id = sc.next();
			sc.nextLine();
			
			if (names.containsKey(id)) {
				System.out.println("결과 >> id : " + id + "\t이름 : " + names.get(id) + "\t비밀번호 : " + passwords.get(id));
			} else {
				System.out.println("해당 회원의 정보가 존재하지 않습니다.");
			}
			
		}

	}

	// 회원 삭제
	public static void deleteInfo(Scanner sc) {

		printInfo();

		if (!names.isEmpty()) {
			System.out.print("삭제할 회원의 아이디를 입력하세요 >> ");
			String id = sc.next();
			sc.nextLine();
			
			if (names.containsKey(id)) {
				System.out.println("결과 >> " + id + "님의 정보가 삭제되었습니다.");
				names.remove(id);
				passwords.remove(id);
				
			} else {
				System.out.println("해당 회원의 정보가 존재하지 않습니다.");
			}
			
		}
	}

	// 회원 모두보기
	public static void printInfo() {
		int i = 1;

		line();
		if (names.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
		} else {
			for (String id : names.keySet()) {
				System.out.println(
						i++ + ". " + "id : " + id + "\t이름 : " + names.get(id) + "\t\t비밀번호 : " + passwords.get(id));
			}
		}
		line();
	}

	// 비밀번호 수정
	public static void modifyPassword(Scanner sc) {

		printInfo();

		if (!names.isEmpty()) {
			System.out.print("수정할 회원의 아이디를 입력하세요 >> ");
			String id = sc.next();
			sc.nextLine();
			
			if (names.containsKey(id)) {
				System.out.print("새로운 비밀번호 >> ");
				String pwd = sc.next();
				sc.nextLine();
				
				passwords.replace(id, pwd);
				
			} else {
				System.out.println("해당 회원의 정보가 존재하지 않습니다.");
			}
			
		}

	}

	public static void line() {
		System.out.println("-------------------------------------------");
	}

}
