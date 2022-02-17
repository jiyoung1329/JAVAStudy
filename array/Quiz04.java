package array;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month, day;
		String[] yoil = {"금요일", "토요일", "일요일", "월요일", "화요일", "수요일", "목요일"};
		int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		while (true) {
			System.out.print("월 일 입력 : ");
			month = sc.nextInt();
			day = sc.nextInt();
			if (1 <= month && month <= 12 && 1 <= day && day <= days[month-1]) break;
		}

		int sum = day;
		for (int i=0; i<month-1; i++) {
			sum += days[i];
		}
		System.out.println("2022년 " + month + "월 " + day + "일은 " + yoil[sum%7] + "입니다.");
		
		
	}
}
