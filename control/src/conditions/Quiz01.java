package conditions;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// 3의 배수 여부 확인
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num % 3 == 0) {
			System.out.println(num +"은 3의 배수 입니다.");
		}else {
			System.out.println(num +"은 3의 배수가 아닙니다.");
			
		}
		
		// 절대값 구하기
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		if (num < 0) {
			System.out.println(num + "의 절대값은 " + (-num) +"입니다.");
		} else {
			System.out.println(num + "의 절대값은 " + (num) +"입니다.");
		}
		
		// 두수 입력 받아 큰 수 출력
		int num1, num2;
		System.out.print("숫자 두 개를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + "와 " +num2 + "중 큰 수는 " + num1 + "입니다.");

		} else if (num2 > num1) {
			System.out.println(num1 + "와 " +num2 + "중 큰 수는 " + num2 + "입니다.");
			
		} else {
			System.out.println(num1 + "와 " +num2 + "는 같습니다.");
			
		}
		
	}
}
