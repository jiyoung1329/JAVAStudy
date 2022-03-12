package exceptions;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
	
		try {
			if(age < 0)
				throw new Exception();
			System.out.println("나이 : " + age);
		} catch (Exception e) {
			System.out.println("나이는 음수가 없어요.");
		} 
		
		System.out.println("다음 코드");
	}
}
