package conditions;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		// 5의 배수 여부 구분하여 출력ㅉ
		System.out.println("수를 입력하세요. : ");
		num = sc.nextInt();
		System.out.print("입력 : " + num + " , 결과 : ");
		
		if (num % 5 == 0) {
			System.out.println("5의 배수입니다.");
		} else {
			System.out.println("5의 배수가 아닙니다.");
			
		}
		
		
		// 0 < num < 100 이면 적중범위 아니면 비적중범위 출력
		System.out.println("수를 입력하세요. : ");
		num = sc.nextInt();
		System.out.print("입력 : " + num + " , 결과 : ");
		
		if (0 < num && num < 100) {
			System.out.println("적중범위 입니다.");
		} else {
			System.out.println("비적중범위 입니다.");
		}
		
		
		// 수를 입력 받아 짝수이고 3의배수이다/아니다 구분하여 출력
		System.out.println("수를 입력하세요. : ");
		num = sc.nextInt();
		System.out.print("입력 : " + num + " , 결과 : ");
		
		if (num % 2 == 0) {
			System.out.print("짝수이고 ");
		} else {
			System.out.print("홀수이고 ");
			
		}
		
		System.out.println((num % 3 == 0)? "3의 배수입니다.":"3의 배수가 아닙니다.");
			
		
		
	}
}
