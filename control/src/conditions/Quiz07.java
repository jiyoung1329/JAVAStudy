package conditions;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2022년 2월 중 날짜를 입력하세요(1~28). : ");
		int day = sc.nextInt();
		int num = day % 7;
		
		
		if (1 <= day && day <= 28) {
			System.out.print("입력한날짜 : " + day + ", 요일 : ");
			switch(num) {
			case 0: System.out.println("월요일입니다."); break;
			case 1: System.out.println("화요일입니다."); break;
			case 2: System.out.println("수요일입니다.");break;
			case 3: System.out.println("목요일입니다.");break;
			case 4: System.out.println("금요일입니다.");break;
			case 5: System.out.println("토요일입니다.");break;
			case 6: System.out.println("일요일입니다.");break;
			}
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}
		
}


