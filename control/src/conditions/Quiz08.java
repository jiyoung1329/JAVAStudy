package conditions;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		String home = "등록안됨", company = "등록안됨";
		while(menu != 4) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록보기 등록");
			System.out.println("4. 나가기");
			menu = sc.nextInt();
			
			if (menu == 1) {
			 System.out.print("우리집 주소를 입력하세요 : ");
			 home = sc.next();
			} else if(menu == 2) {
				System.out.print("회사 주소를 입력하세요 : ");
				company = sc.next();
				
			} else if (menu == 3) {
				System.out.println("우리집 : " + home);
				System.out.println("회사 : " + company);
				
				
			}
			
		}
	}
}
