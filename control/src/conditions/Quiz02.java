package conditions;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		// 세 수를 입력 받아 큰 수 출력
		System.out.print("세 수를 입력하시오. : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
//		System.out.println("num1: " + num1 + ", num2: " + num2 + ", num3: " + num3);
		
		if (num3 > num1 && num3 > num2) {
			System.out.println("가장 큰 수는 " + num3 + "입니다.");
		} else if (num2 > num1){
			System.out.println("가장 큰 수는 " + num2 + "입니다.");
		} else {
			System.out.println("가장 큰 수는 " + num1 + "입니다.");
		}
		
		// 두 수를 입력받아 큰 수가 짝수이면 출력
		System.out.print("두 수를 입력하시오. : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
//		System.out.println("num1: " + num1 + ", num2: " + num2);
		
		if (num1 > num2) {
			if (num1 % 2 == 0) {
				System.out.println(num1 + "이(가) " + num2 + "보다 크며 짝수입니다.");
			}
		} else if (num2 % 2 == 0){
			System.out.println(num2 + "이(가) " + num1 + "보다 크거나 같으면 짝수입니다.");
			
		}
		
		
		// 두 수를 입력받아 합이 짝수이고 3의 배수인 수를 출력
		System.out.print("두 수를 입력하시오. : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int sum = num1 + num2;
//		System.out.println("num1: " + num1 + ", num2: " + num2);
		
		if (sum % 2 == 0 && sum % 3 == 0) {
			System.out.println("num1 + num2 = " + sum +"이고, 두 수의 합은 짝수이고 3의 배수 입니다.");
			
			
		}
	}
}
