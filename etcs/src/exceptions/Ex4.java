package exceptions;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int data1, data2, result;
		
		System.out.print("두 수 입력 : ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		
		String arr[] = {"admin", "1234", "관리자"};
		System.out.print("배열의 인덱스 : ");
		int index = sc.nextInt();
	
		try {
			result = data1 / data2;
			System.out.println(result);
			
			System.out.println("정보 : " + arr[index]);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 생성되지 않은 공간입니다.");
		} finally {
			System.out.println("예외가 발생하든 발생하지 않든 무조건 수행");
		}
		
		System.out.println("다음 코드");
	}
}
