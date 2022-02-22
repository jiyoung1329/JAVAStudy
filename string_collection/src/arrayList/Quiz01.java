package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 전화번호 등록 : 이름(중복허용), 전화번호(중복허용안됨)
		 * 전화번호 확인 : 전화번호로 검색하여 있으면 이름에 전화번호 출력, 없으면 없음 출력
		 * 전화번호 삭제 : 전화번호 있으면 이름과 전화번호 삭제, 없으면 없음 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> tels = new ArrayList<String>();
		String name, tel; 
		
		int choose, check, person = 0;
		
		System.out.println(" >>>>> 전화번호 관리 프로그램 <<<<<");
		while(true) {
			System.out.println();
			System.out.println("아레 메뉴 중 선택해 주세요.");
			System.out.println("----------------------------");
			System.out.println("1. 전화번호 등록");
			System.out.println("2. 전화번호 검색");
			System.out.println("3. 전화번호 삭제");
			System.out.println("4. 전화번호 모두보기");
			System.out.println("5. 프로그램 종료");
			System.out.println("----------------------------");
			System.out.print("선택 >> ");
			
			try {
				choose = sc.nextInt();
				
			}catch(Exception e) {
				System.out.println("숫자를 입력해 주세요");
				sc.nextLine();
				continue;
			}
			 
			// 프로그램 종료
			if (choose == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// 전화번호 모두 보기
			else if (choose == 4) printTels(person, tels, names); 
				
			// 전화번호 삭제
			else if (choose == 3) {
				// 전화번호 출력
				printTels(person, tels, names);
				
				// 삭제할 전화번호 입력
				if (person != 0) {
					System.out.print("삭제할 전화번호를 입력하세요 >> ");
					tel = sc.next();
					check = tels.indexOf(tel);
					if (check == -1) {
						System.out.println("해당 전화번호가 없습니다. ");
					} else {
						person--;
						tels.remove(check);
						names.remove(check);
						System.out.println("삭제 하였습니다.");
					}
				}
				
				
			// 전화번호 검색
			} else if (choose == 2) {
				System.out.println("검색할 전화번호를 입력해 주세요.");
				tel = sc.next();
				
				check = tels.indexOf(tel);
				if (check == -1) {
					System.out.println("없는 번호입니다.");
				} else {
					System.out.println("결과 >> ");
					System.out.println("이름 : " + names.get(check) + ", 전화번호 : " + tels.get(check));
				}
				
				
			// 전화번호 등록
			} else if (choose == 1) {
				// 전화번호
				while(true) {
					System.out.print("등록할 전화번호를 입력해 주세요 >> ");
					tel = sc.next();
					
					// 이미 있는 전화번호면 추가하지 않기
					if (tels.contains(tel)) {
						System.out.println("이미 있는 전화번호입니다. 다른 번호를 입력해주세요.");
						continue;
					} else {
						person++;
						tels.add(tel);
						break;
					}
				}
				
				// 이름
				System.out.print("등록할 이름을 입력해 주세요 >> ");
				name = sc.next();
				names.add(name);
				
			} else {
				System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
			}
	
			
		}
	}
	
	// 전화번호 출력 함수
	public static void printTels(int person, ArrayList<String> tels, ArrayList<String> names) {
		if (person == 0) {
			System.out.println("등록된 전화번호가 없습니다.");
		} else {
			for (int i=0; i<person; i++) {
				System.out.println((i+1) + ". 이름 : " + names.get(i) + "\t전화번호 : " + tels.get(i));
			}
		}
	}
	
}
