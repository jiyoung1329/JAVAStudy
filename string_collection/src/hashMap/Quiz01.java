package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> menus = new HashMap<String, Integer>();

		String menu;
		int choose, price;
		while (true) {
			
			System.out.println("--------------------");
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.println("--------------------");
			System.out.print("선택 >> ");

			// 메뉴 선택하기
			try {
				choose = sc.nextInt();
			} catch (Exception e) {
				System.out.println("숫자를 입력해 주세요.");
				sc.nextLine();
				continue;
			}

			if (choose == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (choose == 2)
				printMenu(menus);

			else if (choose == 1)
				addMenu(sc, menus);

			else
				System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
		}
	}


	// 메뉴 출력하기
	public static void printMenu(HashMap<String, Integer> menus) {
		if (menus.isEmpty()) {
			System.out.println("현재 등록된 메뉴가 없습니다.");
		} else {

			for (String menu : menus.keySet()) {
				System.out.println(menu + " : " + menus.get(menu) + "원");
			}
		}
	}

	// 메뉴 등록하기
	public static HashMap<String, Integer> addMenu(Scanner sc, HashMap<String, Integer> menus) {

		String menu;
		int price;

		while (true) {
			System.out.print("등록할 메뉴를 입력하세요 : ");
			menu = sc.next();
			if (menus.containsKey(menu)) {
				System.out.println("이미 존재하는 메뉴입니다. 다른 메뉴를 입력해주세요.");
			} else {
				while (true) {
					try {
						System.out.print("메뉴의 가격을 입력해주세요 : ");
						price = sc.nextInt();
						break;
					} catch (Exception e) {
						System.out.println("숫자를 입력해주세요");
						sc.nextLine();
						continue;
					}
				}

				menus.put(menu, price);
				break;

			}
		}

		return menus;
	}

}
