package operators;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		int num, data1, data2;
		
		// 수 입력 후, 짝/홀 구분, 3의 배수 여부 확인
		System.out.print("수 입력 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		System.out.println(num + " = " + ((num % 2 == 0)? "짝수": "홀수"));
		System.out.println(num + " = " + ((num % 3 == 0)? "3의 배수 입니다.": "3의 배수가 아닙니다"));
		
		// 두 수 입력 후, 크기 비교
		System.out.print("두 수 입력 : ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		
		System.out.println("data1: " + data1 + ", data2 : " + data2);
		if (data1 == data2) {
			System.out.println("data1과 data2의 수가 같습니다.");
		} else {
			System.out.println((data1 > data2)?"data1이 data2보다 큽니다.":"data2가 data1보다 큽니다.");
		}
	}
}
