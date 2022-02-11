package conditions;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 세 수 중 최대/최소값 구하기
		int num1, num2, num3, max, min;
		System.out.print("세 수를 입력하세요. : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		System.out.println("num1, num2, num3 = " + num1 + ", " + num2 + ", " + num3);
		if (num1 > num2 && num1 > num3) {
			max = num1;
			if (num2 > num3) {
				min = num3;
			} else {
				min = num2;
			}
		} else if (num2 > num3) {
			max = num2;
			if (num1 > num3) {
				min = num3;
			} else {
				min = num1;
			}
		} else {
			max = num3;
			if (num1 > num2) {
				min = num2;
			} else {
				min = num1;
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		
		// 정수를 입력받아 3의 배수, 4의 배수 출력
		System.out.print("숫자를 입력해 주세요. : ");
		int num = sc.nextInt();
		if (num == 0) {
			System.out.println("다시 입력해주세요.");
		} else {
			System.out.print(num + "은(는) ");
			if (num % 3 == 0) {
				if (num % 4 == 0) {
					System.out.println("3의 배수이면서, 4의 배수입니다.");
				} else {
					System.out.println("3의 배수입니다.");
				}
			} else if (num % 4 == 0) {
				System.out.println("4의 배수입니다.");			
			} else {
				System.out.println("3의 배수도 4의 배수도 아닙니다.");
			}
		
		}
	}
}
