package exceptions;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
	
		try {
			if(age < 0)
				throw new AgeMissMatchException(age + "세, 나이는 존재하지 않습니다.");
			System.out.println("나이 : " + age);
		} catch (AgeMissMatchException e) {
			System.out.println(e.getMessage());
		} 
		
		System.out.println("다음 코드");
	}
}
