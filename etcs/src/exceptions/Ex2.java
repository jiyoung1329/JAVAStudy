package exceptions;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data1, data2, result;
		
		System.out.print("두 수 입력 : ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();

		try {
			result = data1 / data2;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없어요.");
		}
		System.out.println("다음 코드");
	}
}
