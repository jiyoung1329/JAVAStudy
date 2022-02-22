package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 회원 등록 : 이름(중복허용), 전화번호(중복허용), 이메일(중복허용안됨) 회원 검색 : 이메일로 검색하여 있으면 이름 전화번호 이메일
		 * 출력, 없으면 없음 출력 회원 삭제 : 이메일로 검색하여 있으면 이름과 전화번호, 이메일 삭제, 없으면 없음 출력 회원 수정 : 이메일로
		 * 검색하여 있으면 이름에 전화번호, 이메일 수정, 없으면 없음 출력
		 */
		Scanner sc = new Scanner(System.in);

		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> tels = new ArrayList<String>();
		ArrayList<String> emails = new ArrayList<String>();
		String name, tel, email;
		String[] infos;

		int choose, idx;

		System.out.println(" >>>>> 회원 관리 프로그램 <<<<<");
		while (true) {
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

			try {
				choose = sc.nextInt();

			} catch (Exception e) {
				System.out.println("숫자를 입력해 주세요");
				sc.nextLine();
				continue;
			}

			// 프로그램 종료
			if (choose == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// 회원 모두 보기
			else if (choose == 5)
				printInfos(tels, names, emails);

			// 회원 삭제
			else if (choose == 4) {
				printInfos(tels, names, emails);

				// 삭제할 회원 입력
				if (emails.size() != 0) {
					System.out.print("삭제할 회원의 이메일을 입력하세요 >> ");
					email = sc.next();

					idx = tels.indexOf(email);
					if (idx == -1) {
						System.out.println("해당하는 회원 정보가 없습니다. ");
					} else {
						emails.remove(idx);
						tels.remove(idx);
						names.remove(idx);
						System.out.println("회원 정보를 삭제 하였습니다.");
					}
				}

			}
			// 회원 수정
			else if (choose == 3) {
				// 회원 출력
				printInfos(tels, names, emails);

				System.out.print("수정할 회원의 이메일을 입력하세요 >>");
				email = sc.next();

				idx = tels.indexOf(email);
				if (idx == -1) {
					System.out.println("해당하는 회원 정보가 없습니다.");
				} else {
					infos = addInfos(sc, emails);
					emails.set(idx, infos[0]);
					names.set(idx, infos[1]);
					tels.set(idx, infos[2]);
				}
				// 회원 검색
			} else if (choose == 2) {
				System.out.println("검색할 회원의 이메일을 입력해 주세요.");
				email = sc.next();

				idx = tels.indexOf(email);
				if (idx == -1) {
					System.out.println("해당하는 회원 정보가 없습니다.");
				} else {
					System.out.println("결과 >> ");
					System.out.println(
							 "이메일 : " + emails.get(idx) + ", 이름 : " + names.get(idx) + ", 전화번호 : " + tels.get(idx));
				}

				// 회원 등록
			} else if (choose == 1) {
				System.out.println("새로운 회원을 등록하세요!\n");
				infos = addInfos(sc, emails);
				emails.add(infos[0]);
				names.add(infos[1]);
				tels.add(infos[2]);

			} else {
				System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
			}

		}
	}

	// 회원 출력 함수
	public static void printInfos(ArrayList<String> emails, ArrayList<String> names, ArrayList<String> tels) {
		if (emails.size() == 0) {
			System.out.println("등록된 회원가 없습니다.");
		} else {
			for (int i = 0; i < emails.size(); i++) {
				System.out.println(
						(i + 1) + ". 이름 : " + names.get(i) + "\t전화번호 : " + tels.get(i) + "\t이메일 : " + emails.get(i));
			}
		}
	}

	// 회원 등록 함수
	public static String[] addInfos(Scanner sc, ArrayList<String> emails) {
		// 순서 : 이메일, 이름, 전화번호
		String[] infos = new String[3];

		// 이메일
		while (true) {
			System.out.print("등록할 회원의 이메일을 입력해 주세요 >> ");
			infos[0] = sc.next();

			// 이미 있는 이메일이면 추가하지 않기
			if (emails.contains(infos[0])) {
				System.out.println("이미 있는 이메일입니다. 다른 이메일을 입력해주세요.");
				continue;
			} else {
				break;
			}
		}

		// 이름
		System.out.print("등록할 이름을 입력해 주세요 >> ");
		infos[1] = sc.next();

		// 전화번호
		System.out.print("등록할 전화번호를 입력해 주세요 >> ");
		infos[2] = sc.next();

		return infos;
	}

}
