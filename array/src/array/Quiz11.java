package array;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 아파트 입주자 정보 =====");
		
		System.out.print("건물의 층수를 입력하세요 : ");
		int floor = sc.nextInt();
		
		// 아파트 만들기
		String[][] apartment = new String[floor][];
		
		int room;
		for (int i=0; i<floor; i++) {
			System.out.print((i+1) + "층의 총 호실 입력 : ");
			apartment[i] = new String[sc.nextInt()];
		}
		sc.nextLine();
		
		// 출력
		for (int i=0; i<floor; i++) {
			System.out.println((i+1) + "층은 " + apartment[i].length +"호실까지 있습니다.");
		}
		
		// 입주자 정보 입력
		String name;
		System.out.println("각 호실의 입주자 정보를 입력하세요.");
		for (int i=0; i<floor; i++) {
			System.out.println((i+1) + "층 정보를 입력하세요.");
			
			for (int j=0; j<apartment[i].length; j++) {
				while(true) {
					System.out.print((i+1) +"층 " +(j+1) + "호실: ");
					name = sc.nextLine();
					if (!name.equals("")) {
						apartment[i][j] = name;
						break;
					}
				}
			}
		}
		
		// 입주자 정보 출력
		System.out.println("===== 입주자 정보 =====");
		for (int i=0; i<floor; i++) {
			for (int j=0; j<apartment[i].length; j++) {
				System.out.println((i+1) +"층 " +(j+1) + "호실 입주자: "  + apartment[i][j]);
			}
		}
		
	}
}

